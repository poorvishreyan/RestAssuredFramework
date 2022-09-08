package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParametersTest {

	@Test
	
	public void queryParameter()
	{
		String baseURI = "https://reqres.in";
		
		given()
		.queryParam("page", 2)
		
		.when()
		.get("/api/users")
		
		.then()
		.log().all();
		
		
		
	}
}
