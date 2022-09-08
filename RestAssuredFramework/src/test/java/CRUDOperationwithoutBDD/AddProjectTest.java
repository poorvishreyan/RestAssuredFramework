package CRUDOperationwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	
	@Test
	public void create() {
		
		//json body 
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "soumya");
		jobj.put("projectName", "Hii");
		jobj.put("status", "created");
		jobj.put("teamSize", 5);
		
		//pre-conditions(body and content type)
		RequestSpecification reqspec = RestAssured.given();
		reqspec.contentType(ContentType.JSON);
		reqspec.body(jobj);
		
		//action/validation
		Response response = reqspec.post("http://localhost:8084/addProject");
		ValidatableResponse validateResp = response.then();
		validateResp.assertThat().contentType(ContentType.JSON);
		validateResp.assertThat().statusCode(201);
		validateResp.log().all();
		
		
	}

}
