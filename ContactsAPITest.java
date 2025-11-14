package apitestwithBBD;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class ContactsAPITest {
	
	@BeforeMethod
	public  void setUpTestApi() {
		RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
	}
	
	@Test(description =" test case passed with valid bearer token:" )
	public void getContactAPiTest()
	{
		given().log().all()
		.header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2OTAzNTk0MmIzYWU5MDAwMTUyZDZhZjkiLCJpYXQiOjE3NjE4MjgxNzd9.BLFIBRMFNr74YHVfQz4FR7gf-fJGdVVYo562D8gZoMU")
		.when()
		.get("/contacts")
		.then().log().all()
		.assertThat()
		.statusCode(200)
		.and()
		.contentType(ContentType.JSON);    
		
	}
	
	@Test (description = "test case passed with invalid bearer token:")
	public void getContactAPiTest2()
	{
		given().log().all()
		.header("Authorization","Bearer eyJhbGciiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2OTAzNTk0MmIzYWU5MDAwMTUyZDZhZjkiLCJpYXQiOjE3NjE4MjgxNzd9.BLFIBRMFNr74YHVfQz4FR7gf-fJGdVVYo562D8gZoMU")
		.when()
		.get("/contacts")
		.then().log().all()
		.assertThat()
		.statusCode(401)
		.and()
		.contentType(ContentType.JSON);    
		
	}

}
