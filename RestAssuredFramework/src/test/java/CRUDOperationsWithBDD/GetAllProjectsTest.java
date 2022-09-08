package CRUDOperationsWithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class GetAllProjectsTest {
	
	@Test
	public void getProjects()
	{
	
		when()
		.get("http://localhost:8084/projects")
		
		.then()
		.log().all();
	}

}
