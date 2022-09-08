package POJOClassForPOST;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UsingHashMap {
	@Test
	
	public void createProjectUsingHashMap()
	{
		HashMap hm = new HashMap();
		hm.put("createdBy", "Nikitha");
		hm.put("projectName", "iRis");
		hm.put("status", "completed");
		hm.put("teamSize", 12);
		
		given()
		.body(hm).contentType(ContentType.JSON)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
		
	}

}
