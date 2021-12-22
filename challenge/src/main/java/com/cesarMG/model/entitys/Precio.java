package com.cesarMG.model.entitys;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

/**
 * entidad para el modelo de datos tabla prices, 
 * se han añadido nuevos campos y un identificdor unico
 * @author cmunozg
 *
 */
@Entity
@Table(name = "PRICES")
@SqlResultSetMapping(
	    name="pricesMapping",
	    entities={
	    		@EntityResult(
	    				entityClass =Precio.class,
	    		fields={
	    			@FieldResult(column="IDREG", name = "idReg"),
	    			@FieldResult(column="BRAND_ID", name = "id"),
	    			@FieldResult(column="START_DATE", name = "fechaIni"),
	    			@FieldResult(column="END_DATE", name = "fechaFin"),
	                @FieldResult(column="PRICE_LIST", name = "listaPrecio"),
	                @FieldResult(column="PRODUCT_ID", name = "productId"),
	                @FieldResult(column="PRIORITY", name = "priority"),
	                @FieldResult(column="PRICE", name = "precio"),
	                @FieldResult(column="CURR", name = "curr")
	                
	            }
	        )
	    }
	)

@NamedNativeQuery(name="findPrices", query="SELECT idReg,id,fechaIni,fechaFin,listaPrecio,productId,priority,precio,curr FROM Precio WHERE productId = "
		+ ":idProd AND id = :id AND(fechaIni <= :fecha AND fechaFin >= :fecha) ", resultSetMapping="pricesMapping")
public class Precio {
	
	@Id
	@Column(name = "IDREG", nullable = false)
	private String idReg;
	
	@Column(name = "BRAND_ID", nullable = false)
	private String id;

	@Column(name = "START_DATE", nullable = false)
	private Timestamp fechaIni;

	@Column(name = "END_DATE", nullable = false)
	private Timestamp fechaFin;
	

	@Column(name = "PRICE_LIST", nullable = false)
	private String listaPrecio;
	
	@Column(name = "PRODUCT_ID", nullable = false)
	private String productId;
	
	@Column(name = "PRIORITY", nullable = false)
	private Integer priority;
	
	@Column(name = "PRICE", nullable = false)
	private BigDecimal precio;
	
	@Column(name = "CURR", nullable = false)
	private String curr;

	
	

	/**
	 * Default constructor
	 */
	public Precio() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * Constuctor con parametros
	 * @param idReg String
	 * @param id String
	 * @param fechaIni Timestamp
	 * @param fechaFin Timestamp
	 * @param listaPrecio String
	 * @param productId String
	 * @param priority Integer
	 * @param precio BigDecimal
	 * @param curr String
	 */
	public Precio(String idReg, String id, Timestamp fechaIni, Timestamp fechaFin,
			String listaPrecio, String productId, Integer priority, BigDecimal precio, String curr) {
		super();
		this.idReg = idReg;
		this.id = id;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.listaPrecio = listaPrecio;
		this.productId = productId;
		this.priority = priority;
		this.precio = precio;
		this.curr = curr;
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
