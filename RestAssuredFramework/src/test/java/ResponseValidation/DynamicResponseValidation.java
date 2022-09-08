package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {

	@Test
	
	public void dynamicResponse()
	{
		String expectedProject_ID = "TY_PROJ_010";
		
		//action
		Response response = when().get("http://localhost:8084/projects");
		
		//validation
		 List<String>  projectID = response.jsonPath().get("projectId");
		 
		boolean flag = false;
		 
		 
		for(String actualProject_ID : projectID)
		 {
			 if(actualProject_ID.equals(expectedProject_ID))
			 {
				 System.out.println("project name is matching");
				 flag = true;
			 }
		 }
		 
		Assert.assertTrue(flag);
		System.out.println("data verified");
		
		response.then().log().all();
	}
}
