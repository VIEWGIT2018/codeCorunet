package com.cesarMG.errors;

import java.util.Date;


/**
 * @author cmunozg
 *
 */
public class Error {

	
	private Date timestamp;
    private String mensaje;
    private String detalles;

    public Error(Date timestamp, String mensaje, String detalles) {
         super();
         this.timestamp = timestamp;
         this.mensaje = mensaje;
         this.detalles = detalles;
    }

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
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

	/**
	 * @return the detalles
	 */
	public String getDetalles() {
		return detalles;
	}

	/**
	 * @param detalles the detalles to set
	 */
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

   
	
	
}
