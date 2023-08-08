package com.inditex.ws;

import java.util.List;

import com.inditex.ws.model.PriceEntity;

public interface IPriceService {
	List<PriceEntity> getPriceNative(Long brandId, Long productId, String startDate);
}
