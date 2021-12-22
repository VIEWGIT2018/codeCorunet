package challenge.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cesarMG.beans.PrecioInput;
import com.cesarMG.beans.PrecioOutput;

/**
 * test para las distintas operaciones de precios
 * @author cmunozg
 *
 */
public class PriceTest extends ConfigTest {
	   @Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }

	   
	   
	   @Test
	   public void getPrices1() throws Exception {

	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/v1/precios")
	    		  .contentType(MediaType.APPLICATION_JSON_VALUE)
	 	         .content(super.mapToJson(new PrecioInput("35455", "1", "2020-06-14 10:00:00.0")))).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      PrecioOutput salidaOk = super.mapFromJson(content, PrecioOutput.class);
	      assertEquals(salidaOk.getFechaIni(),"2020-06-14 00:00:00.0");
	      assertEquals(salidaOk.getFechaFin(),"2020-12-31 23:59:59.0");
	      assertEquals(salidaOk.getPrecio().toString(),"35.50");
	      
	      System.out.println("Salida test1 ==>"+salidaOk);
	   }
	  
	   
	   @Test
	   public void getPrices2() throws Exception {

	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/v1/precios")
	    		  .contentType(MediaType.APPLICATION_JSON_VALUE)
	 	         .content(super.mapToJson(new PrecioInput("35455", "1", "2020-06-14 16:00:00.0")))).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      PrecioOutput salidaOk = super.mapFromJson(content, PrecioOutput.class);
	      assertEquals(salidaOk.getFechaIni(),"2020-06-14 15:00:00.0");
	      assertEquals(salidaOk.getFechaFin(),"2020-06-14 18:30:00.0");
	      assertEquals(salidaOk.getPrecio().toString(),"25.45");
	      
	      System.out.println("Salida test2 ==>" + salidaOk);
	   }
	   @Test
	   public void getPrices3() throws Exception {

	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/v1/precios")
	    		  .contentType(MediaType.APPLICATION_JSON_VALUE)
	 	         .content(super.mapToJson(new PrecioInput("35455", "1", "2020-06-14 21:00:00.0")))).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      PrecioOutput salidaOk = super.mapFromJson(content, PrecioOutput.class);
	      assertEquals(salidaOk.getFechaIni(),"2020-06-14 00:00:00.0");
	      assertEquals(salidaOk.getFechaFin(),"2020-12-31 23:59:59.0");
	      assertEquals(salidaOk.getPrecio().toString(),"35.50");
	      
	      System.out.println("Salida test3 ==>"+ salidaOk);
	   }
	   
	   @Test
	   public void getPrices4() throws Exception {

	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/v1/precios")
	    		  .contentType(MediaType.APPLICATION_JSON_VALUE)
	 	         .content(super.mapToJson(new PrecioInput("35455", "1", "2020-06-15 10:00:00.0")))).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      PrecioOutput salidaOk = super.mapFromJson(content, PrecioOutput.class);
	      assertEquals(salidaOk.getFechaIni(),"2020-06-15 00:00:00.0");
	      assertEquals(salidaOk.getFechaFin(),"2020-06-15 11:00:00.0");
	      assertEquals(salidaOk.getPrecio().toString(),"30.50");
	      
	      System.out.println("Salida test4 ==>" + salidaOk);
	   }
	   
	   @Test
	   public void getPrices5() throws Exception {

	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/v1/precios")
	    		  .contentType(MediaType.APPLICATION_JSON_VALUE)
	 	         .content(super.mapToJson(new PrecioInput("35455", "1", "2020-06-16 21:00:00.0")))).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      PrecioOutput salidaOk = super.mapFromJson(content, PrecioOutput.class);
	      assertEquals(salidaOk.getFechaIni(),"2020-06-15 16:00:00.0");
	      assertEquals(salidaOk.getFechaFin(),"2020-12-31 23:59:59.0");
	      assertEquals(salidaOk.getPrecio().toString(),"38.95");
	      
	      System.out.println("Salida test5 ==>" + salidaOk);
	   }
	}