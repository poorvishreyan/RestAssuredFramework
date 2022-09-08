package POJOClassForPOST;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.http.ContentType.*;

import java.util.concurrent.TimeUnit;

public class UsingJsonObjectTest {
	
	
@Test
	
	public void create() {
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Lion3");
		obj.put("projectName", "galaxy14");
		obj.put("status", "created");
		obj.put("teamSize", 15);
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.assertThat().contentType(ContentType.JSON).statusCode(201)
		.log().all();

}
}
