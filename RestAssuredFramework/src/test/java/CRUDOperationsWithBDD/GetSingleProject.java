package CRUDOperationsWithBDD;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class GetSingleProject {
	
	@Test
	
	public void getSingleProject()
	{
		when()
		.get("http://localhost:8084/projects/TY_PROJ_217")
		
		.then()
		.log().all();
	}
	
	

}
