package com.inditex.ws.model;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.inditex.ws.repository.PriceRepository;

@Configuration
public class DataLoader {
	
	@Bean
	public CommandLineRunner loadData(PriceRepository priceRepository) {
		return args -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
            PriceEntity price1 = new PriceEntity(1L, dateFormat.parse("2020-06-14-00.00.00"), dateFormat.parse("2020-12-31-23.59.59"),
                    1L, 35455L, 0, 35.50, "EUR");
            PriceEntity price2 = new PriceEntity(1L, dateFormat.parse("2020-06-14-15.00.00"), dateFormat.parse("2020-06-14-18.30.00"),
                    2L, 35455L, 1, 25.45, "EUR");
            PriceEntity price3 = new PriceEntity(1L, dateFormat.parse("2020-06-15-00.00.00"), dateFormat.parse("2020-06-15-11.00.00"),
                    3L, 35455L, 1, 30.50, "EUR");
            PriceEntity price4 = new PriceEntity(1L, dateFormat.parse("2020-06-15-16.00.00"), dateFormat.parse("2020-12-31-23.59.59"),
                    4L, 35455L, 1, 38.95, "EUR");

            priceRepository.saveAll(Arrays.asList(price1, price2, price3, price4));
        };
	}
	
}
