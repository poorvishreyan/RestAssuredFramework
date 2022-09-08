package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameterTest {

	@Test
	
	public void getSingleProject()
	{
		//pre-requisites
		String baseURI = "http://localhost";
		port = 8084;
		
		given()
		.pathParam("pid", "TY_PROJ_008")
		
		//Actions
		.when()
		.get("/projects/{pid}")
		
		//validations
		.then()
		.log().all();		
	}
}
