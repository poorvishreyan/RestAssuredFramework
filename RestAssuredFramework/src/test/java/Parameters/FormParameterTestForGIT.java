package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParameterTestForGIT {
	
	@Test
	
	public void parametersTest()
	{
		String baseURI = "https://api.github.com";
		
		given()
		.pathParam("username", "poorvishreyan")
		.queryParam("per-page", 12)
		.queryParam("page", 1)
		
		.when()
		.get("/users/{username}/repos")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
