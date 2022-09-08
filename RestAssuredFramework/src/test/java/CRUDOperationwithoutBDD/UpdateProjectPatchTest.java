package CRUDOperationwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectPatchTest {
	@Test
	
	public void update() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "poorvi");
		jobj.put("projectName", "dell384");
		jobj.put("status", "on-going");
		jobj.put("teamSize", 10);
		
		//pre-conditions(body and content type
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(jobj);
		
		//action
		Response response = reqSpec.patch("http://localhost:8084/projects/TY_PROJ_005");
		ValidatableResponse validate = response.then();
		
		validate.assertThat().contentType(ContentType.JSON);
		validate.assertThat().statusCode(200);
		validate.log().all();
	}

}
