package com.inditex.ws.controller;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.inditex.ws.model.Price;
import com.inditex.ws.model.PriceEntity;

@Mapper
public interface PriceMapper {
	PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
	
	PriceEntity toEntity(Price price);

    Price fromEntity(PriceEntity priceEntity);
	
}
