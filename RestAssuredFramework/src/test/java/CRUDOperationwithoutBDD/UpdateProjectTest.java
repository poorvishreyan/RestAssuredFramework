package CRUDOperationwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	@Test
	public void updation() {
		
	
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "AJ");
	jobj.put("projectName", "ITC");
	jobj.put("status", "completed");
	jobj.put("teamSize", 4);
	
	//pre-conditions (body and content type)
	RequestSpecification reqSpec = RestAssured.given();
	reqSpec.contentType(ContentType.JSON);
	reqSpec.body(jobj);
	
	//action
	Response response = reqSpec.put("http://localhost:8084/projects/TY_PROJ_209");
	ValidatableResponse validate = response.then();
	
	validate.assertThat().contentType(ContentType.JSON);
	validate.assertThat().statusCode(200);
	validate.log().all();
	
	}
	
	
}
