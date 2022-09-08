package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {
	@Test
	
	public void updateProject() {
		
		JSONObject obj = new JSONObject();
		obj.put("createdBy","Ganesha");
		obj.put("projectName", "shivaparvathi");
		obj.put("status", "on-going");
		obj.put("teamSize", 6);
		
		given().contentType(ContentType.JSON).body(obj)
		.when().put("http://localhost:8084/projects/TY_PROJ_203")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.statusCode(200).log().all();
	}

}
