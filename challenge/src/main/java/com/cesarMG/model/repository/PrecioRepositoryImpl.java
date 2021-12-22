package com.cesarMG.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesarMG.model.entitys.Precio;

/**
 * @author cmunozg
 *
 */
@Repository
public interface PrecioRepositoryImpl extends JpaRepository<Precio, String> , PrecioRepositoryCustom{


}
