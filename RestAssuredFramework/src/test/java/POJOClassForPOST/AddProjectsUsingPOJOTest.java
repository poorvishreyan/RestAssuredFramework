package POJOClassForPOST;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectsUsingPOJOTest {

	@Test
		
		public void addProject(){
		
		PojoClass.PojoForPost pojo = new PojoClass.PojoForPost("smita", "airtel","created",3);
		
		given()
		.body(pojo).contentType(ContentType.JSON)
		
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		

	}

}
