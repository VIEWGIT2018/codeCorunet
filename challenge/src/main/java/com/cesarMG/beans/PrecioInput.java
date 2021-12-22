package com.cesarMG.beans;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * datos de entrada del sseervico rest de precios
 * @author cmunozg
 *
 */

public class PrecioInput {

	/**
	 * identificador de producto
	 */
	@JsonProperty("idProducto")
	@NotBlank(message = "Campo idProducto obligatorio")
	private String idProducto;

	/**
	 * identificador de cadena
	 */
	@JsonProperty("idCadena")
	@NotBlank(message = "Campo idCadena obligatorio")
	private String idCadena;

	/**
	 *  fechas de aplicación
	 */
	@JsonProperty("fecha")
	@NotBlank(message = "Campo fecha obligatorio")
	private String fecha;
	
	

	/**
	 * 
	 */
	public PrecioInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param idProducto
	 * @param idCadena
	 * @param fecha
	 */
	public PrecioInput(@NotBlank(message = "Campo idProducto obligatorio") String idProducto,
			@NotBlank(message = "Campo idCadena obligatorio") String idCadena,
			@NotBlank(message = "Campo fecha obligatorio") String fecha) {
		super();
		this.idProducto = idProducto;
		this.idCadena = idCadena;
		this.fecha = fecha;
	}



	/**
	 * @return the idProducto
	 */
	public String getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return the idCadena
	 */
	public String getIdCadena() {
		return idCadena;
	}

	/**
	 * @param idCadena the idCadena to set
	 */
	public void setIdCadena(String idCadena) {
		this.idCadena = idCadena;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	



	
	
	
	
	
}
