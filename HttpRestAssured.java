package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HttpRestAssured {
	
	int id;
	
	@Test(priority = 5)
	void getUsers() {
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority = 2)
	void getCreate()
	{
		    HashMap data = new HashMap();
		    data.put("name", "kanth");
		    data.put("job", "POLICE");
		given()
		.header("x-api-key", "reqres-free-v1")

		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		 
		    .log().all();
	}
	
	@Test(priority = 3)
	void update()
	{
		given()
		.header("x-api-key", "reqres-free-v1")
		.when()
		.put("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200)
		 
		    .log().all();
		}
	@Test(priority = 4)
	void delete()
	{
		given()
		.header("x-api-key", "reqres-free-v1")
		.when()
		.delete("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(204)
		 
		    .log().all();
		}}
