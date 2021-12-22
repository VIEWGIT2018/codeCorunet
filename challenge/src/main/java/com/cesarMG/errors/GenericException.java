package com.cesarMG.errors;

import org.springframework.stereotype.Component;

@Component
public class GenericException extends Exception{

	
	/***/
	private static final long serialVersionUID = -8615818903727305933L;
	/***/
	private String mensaje;
	

	/**
	 * 
	 */
	public GenericException() {
		super();
	
	}
	/**
	 * @param mensaje
	 */
	public GenericException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	
}
