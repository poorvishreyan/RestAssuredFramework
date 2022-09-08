package ResponseValidation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticResponseValidationTest {
	
	@Test
	public void staticResponse()
	
	{
		String expectedProjectName="Google-228";
		
		Response response = when().get("http://localhost:8084/projects");
		
		String actualProjectName = response.jsonPath().getString("[4].projectName");
		
		System.out.println(actualProjectName);
		
		//validation
		Assert.assertEquals(expectedProjectName, actualProjectName);
		
		System.out.println("data verified");
		
		response.then().log().all();
	
	}

}
