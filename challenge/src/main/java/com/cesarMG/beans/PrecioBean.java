package com.cesarMG.beans;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author cmunozg
 *
 */
public class PrecioBean {
	
	
	private String idReg;
	
	
	private String id;

	
	private Timestamp fechaIni;

	
	private Timestamp fechaFin;
	

	
	private String listaPrecio;
	
	
	private String productId;
	
	
	private Integer priority;
	
	
	private BigDecimal precio;
	
	
	private String curr;

	
	

	/**
	 * Default constructor
	 */
	public PrecioBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	/**
	 * @return the idReg
	 */
	public String getIdReg() {
		return idReg;
	}

	/**
	 * @param idReg the idReg to set
	 */
	public void setIdReg(String idReg) {
		this.idReg = idReg;
	}

	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the fechaIni
	 */
	public Timestamp getFechaIni() {
		return fechaIni;
	}

	/**
	 * @param fechaIni the fechaIni to set
	 */
	public void setFechaIni(Timestamp fechaIni) {
		this.fechaIni = fechaIni;
	}

	/**
	 * @return the fechaFin
	 */
	public Timestamp getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Timestamp fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the listaPrecio
	 */
	public String getListaPrecio() {
		return listaPrecio;
	}

	/**
	 * @param listaPrecio the listaPrecio to set
	 */
	public void setListaPrecio(String listaPrecio) {
		this.listaPrecio = listaPrecio;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
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
	 * @return the curr
	 */
	public String getCurr() {
		return curr;
	}

	/**
	 * @param curr the curr to set
	 */
	public void setCurr(String curr) {
		this.curr = curr;
	}


	
}
