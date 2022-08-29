package org.api;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredPractice {

	//@Test
	public void getRequest() {

		String url = "https://reqres.in/api/users/2";
		Response response = RestAssured.get(url);
		
		int statusCode = response.statusCode();
		ResponseBody body = response.getBody();
		
		String asPrettyString = body.asPrettyString();
		
		System.out.println(statusCode);
		
		System.out.println(asPrettyString);
		
		System.out.println();
	}
	//@Test
	public static Response postRequest(String endpoint, String requestbody) {

		RestAssured.baseURI = "https://reqres.in";
		
		
		Response response = RestAssured.given().body(requestbody)
		.when().post(endpoint)
		.then().extract().response();
		
//		String string = response.body().jsonPath().get("id").toString();
//		System.out.println(string);
			
		return response;
		
	}
	
	
	
	public static void main(String[] args) {
		String ep = "/api/users";
		String req = "{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
		
		
		Response rs = postRequest(ep,req);
		String asPrettyString = rs.body().asPrettyString();
		System.out.println(asPrettyString);
		
		
		
	}
	
	
}
