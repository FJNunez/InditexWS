package com.inditex.ws;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inditex.ws.PriceService;
import com.inditex.ws.controller.PriceController;

@ContextConfiguration(classes = PriceController.class)
@WebMvcTest(PriceController.class)
public class Tests {
	@MockBean private PriceService service;
	
	@Test
	//Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	public void test001()throws JsonProcessingException{
		try {
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/prices?brandId=1&productId=35455&startDate=2020-06-14+10:00:00"))
					  .GET()
					  .build();
			HttpClient client = HttpClient.newHttpClient();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println(response.body());
			   
		}catch(Exception ex) {
			System.out.println("error:"+ex);
		}
		
	}
	
	
	@Test
	//Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	public void test002()throws JsonProcessingException{
		try {
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/prices?brandId=1&productId=35455&startDate=2020-06-14+16:00:00"))
					  .GET()
					  .build();
			HttpClient client = HttpClient.newHttpClient();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println(response.body());
		}
		catch(Exception ex) {
			System.out.println("error:"+ex);
		}
	}
	
	@Test
	//Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	public void test003()throws JsonProcessingException{
		try {
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/prices?brandId=1&productId=35455&startDate=2020-06-14+21:00:00"))
					  .GET()
					  .build();
			HttpClient client = HttpClient.newHttpClient();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println(response.body());
		}
		catch(Exception ex) {
			System.out.println("error:"+ex);
		}
	}
	
	@Test
	//Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
	public void test004()throws JsonProcessingException{
		try {
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/prices?brandId=1&productId=35455&startDate=2020-06-15+10:00:00"))
					  .GET()
					  .build();
			HttpClient client = HttpClient.newHttpClient();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println(response.body());
		}
		catch(Exception ex) {
			System.out.println("error:"+ex);
		}
	}
	
	
	@Test
	//Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
	public void test005()throws JsonProcessingException{
		try {
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/prices?brandId=1&productId=35455&startDate=2020-06-16+21:00:00"))
					  .GET()
					  .build();
			HttpClient client = HttpClient.newHttpClient();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println(response.body());
		}
		catch(Exception ex) {
			System.out.println("error:"+ex);
		}
	}

}
