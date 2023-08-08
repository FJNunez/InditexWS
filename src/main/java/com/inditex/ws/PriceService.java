package com.inditex.ws;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inditex.ws.model.PriceEntity;
import com.inditex.ws.repository.PriceRepository;

@Component
public class PriceService implements IPriceService {
	private final PriceRepository priceRepository;
	
	@Autowired
	public PriceService(PriceRepository priceRepository) {
		this.priceRepository=priceRepository;
	}
	
	public List<PriceEntity> getPriceNative(Long brandId,Long productId,String startDate){
		try {
			List <PriceEntity> pricesdb = priceRepository.findAllNative(brandId,productId,startDate );
			if(pricesdb.isEmpty()) {
				throw new InputErrorException("No se encontraron precios para los parámetros dados.");
			}
			
			return pricesdb;
		}catch(Exception ex) {
			throw new InputErrorException(ex.toString());
		}
		
	}
}
