package CRUDOperationsWithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteProjectTest {
	
	@Test
	
	public void deleteProject()
	{
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_210")
		
		
		.then()
		.log().all();
	}

}
