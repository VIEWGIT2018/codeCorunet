package com.cesarMG.manager;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cesarMG.beans.PrecioInput;
import com.cesarMG.beans.PrecioOutput;
import com.cesarMG.errors.GenericException;
import com.cesarMG.model.entitys.Precio;
import com.cesarMG.model.repository.PrecioRepositoryCustom;

/**
 * Capa logica de manger para las operacioens del servicio
 * @author cmunozg
 *
 */
@Component
public class PricesManager {

	@Autowired
	private PrecioRepositoryCustom repository;
	
	
	/**
	 * logica de acceso a BD y obtrenion de datos
	 * @param entrada PrecioInput
	 * @return PrecioOutput
	 * @throws GenericException
	 */
	public PrecioOutput obtenerPrecios(PrecioInput entrada) throws GenericException{
		
		List<PrecioOutput> salida = new ArrayList<PrecioOutput>();
		List<Precio> listaPrecios = new ArrayList<Precio>();
		
		try {
	
		repository.findPrices(entrada.getIdProducto(),entrada.getIdCadena(),
				Timestamp.valueOf(entrada.getFecha())).forEach(listaPrecios::add);
			
		} catch (Throwable e) {
			e.printStackTrace();
			throw new GenericException("Error en acceso a BD");
		}
		
	
			listaPrecios.stream().filter(s -> !listaPrecios.isEmpty()).map(f -> new PrecioOutput(f.getProductId(), f.getId(), f.getListaPrecio(),
					f.getFechaIni().toString(), f.getFechaFin().toString(), f.getPrecio())).collect(Collectors.toList()).forEach(salida::add);
		
		return salida.stream().filter(s -> !salida.isEmpty()).findFirst().orElse(new PrecioOutput());
	}
	
	

	
	
}
