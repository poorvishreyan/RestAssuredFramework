package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectTest {

	@Test
	
	public void create() {
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "tiger");
		obj.put("projectName", "projectss");
		obj.put("status", "created");
		obj.put("teamSize", 11);
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.assertThat().contentType(ContentType.JSON).statusCode(201)
		.log().all();
		
		
	}
}
