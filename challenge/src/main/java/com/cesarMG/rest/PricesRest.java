package com.cesarMG.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarMG.beans.PrecioInput;
import com.cesarMG.beans.PrecioOutput;
import com.cesarMG.errors.GenericException;
import com.cesarMG.manager.PricesManager;

/**
 * @author cmunozg
 *
 */
@RestController
@RequestMapping("/api/v1")
public class PricesRest {


	
	@Autowired	
	private PricesManager manager;	
		
		
	
	/**
	 * @param entrada
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/precios")
	public ResponseEntity <PrecioOutput> getPrecios(@Valid @RequestBody PrecioInput entrada) throws GenericException {
		
		PrecioOutput salida  = manager.obtenerPrecios(entrada);

	    return ResponseEntity.ok().body(salida);
	}

	
}
