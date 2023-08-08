package com.inditex.ws.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.inditex.ws.model.PriceEntity;
public interface PriceRepository extends JpaRepository<PriceEntity,Long> {

	@Query(value = "SELECT * FROM PRICE WHERE BRAND_ID = :brandId AND PRODUCT_ID = :productId AND START_DATE >= :startDate AND END_DATE >= :startDate ORDER BY PRIORITY DESC;", nativeQuery = true)
	 List<PriceEntity> findAllNative(@Param("brandId") Long brandId,@Param("productId") Long productId,@Param("startDate") String startDate);

	
}
