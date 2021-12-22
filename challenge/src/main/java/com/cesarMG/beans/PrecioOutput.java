package com.cesarMG.beans;

import java.math.BigDecimal;

/**
 * datos de salida del sseervico rest de precios
 * @author cmunozg
 *
 */
public class PrecioOutput {

	/**
	 * identificador de producto
	 */
	private String idProducto;

	
	/**
	 * identificador de cadena
	 */
	private String idCadena;

	
	/**
	 * tarifa a aplicar
	 */
	private String tarifa;
	
	
	/**
	 *  fechas de aplicación
	 */
	private String fechaIni;

	/**
	 *  fechas de aplicación
	 */
	private String fechaFin;
	/**
	 *  precio final a aplicar
	 */
	private BigDecimal precio;


	/**
	 * constructor default
	 */
	public PrecioOutput() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 *  constructor params
	 * @param idProducto String
	 * @param idCadena String
	 * @param tarifa String
	 * @param fechaIni String
	 * @param fechaFin String
	 * @param precio BigDecimal
	 */
	public PrecioOutput(String idProducto, String idCadena, String tarifa, String fechaIni, String fechaFin,
			BigDecimal precio) {
		super();
		this.idProducto = idProducto;
		this.idCadena = idCadena;
		this.tarifa = tarifa;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.precio = precio;
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
	 * @return the tarifa
	 */
	public String getTarifa() {
		return tarifa;
	}


	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}



	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}



	/**
	 * @return the fechaIni
	 */
	public String getFechaIni() {
		return fechaIni;
	}



	/**
	 * @param fechaIni the fechaIni to set
	 */
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}



	/**
	 * @return the fechaFin
	 */
	public String getFechaFin() {
		return fechaFin;
	}



	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}



	/**
	 *
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PrecioOutput [idProducto=");
		builder.append(idProducto);
		builder.append(", idCadena=");
		builder.append(idCadena);
		builder.append(", tarifa=");
		builder.append(tarifa);
		builder.append(", fechaIni=");
		builder.append(fechaIni);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}


	
	
	
	
	
}
