package com.cesarMG.model.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cesarMG.model.entitys.Precio;

/**
 * @author cmunozg
 *
 */
@Repository
public interface PrecioRepositoryCustom {
	
	@Query(value="SELECT IDREG,BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRODUCT_ID,PRIORITY,PRICE,CURR FROM PRICES WHERE "
			+ "PRODUCT_ID = :idProd AND BRAND_ID = :id AND(START_DATE <= :fecha AND END_DATE >= :fecha) ORDER BY PRIORITY DESC", nativeQuery = true )
	List<Precio> findPrices(@Param("idProd") String idProd,@Param("id") String id,@Param("fecha") Timestamp fecha);

	
}
