package com.inditex.ws.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.ws.PriceService;
import com.inditex.ws.model.PriceEntity;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Counter;
import io.prometheus.client.exporter.PushGateway;

import com.inditex.ws.model.Price;
import com.inditex.ws.controller.PriceMapper;

@RestController
@RequestMapping("/prices")
public class PriceController {
	
	@Autowired
    private PriceService priceService;
	
	@Autowired
	public PriceController(PriceService priceService) {
		this.priceService=priceService;
	}
	
	@GetMapping()
    public List<Price> searchAllbyNative(@RequestParam("brandId") Long brandId,@RequestParam("productId") Long productId,@RequestParam("startDate") String startDate){
        List<PriceEntity> pricesdb=priceService.getPriceNative(brandId,productId,startDate);
        List<Price> prices = pricesdb.stream()
                .map(PriceMapper.INSTANCE::fromEntity)
                .collect(Collectors.toList());
        try {
        	CollectorRegistry registry = CollectorRegistry.defaultRegistry;
            Counter requestsTotal = Counter.build()
                .name("getPrices")
                .help("Numero de veces totales que se consultan los precios")
                .register();
            requestsTotal.inc();
            PushGateway pushGateway = new PushGateway("127.0.0.1:9091");
            pushGateway.push(registry,"getPrices");
        }catch(Exception ex) {
        	System.out.println("Error:"+ex);
        }
 
        
		return prices;
    }

	
	
	
}
