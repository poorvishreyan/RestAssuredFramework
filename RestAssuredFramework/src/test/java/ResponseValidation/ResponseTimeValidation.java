package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {
	
	@Test
	
	public void responseTimeValidation()
	{
		//pre-requisites
		String baseURI = "http://localhost";
		int port = 8084;
		
		//action
		when().get("/projects")
		
		//validation
		.then().assertThat().time(Matchers.lessThan(50L), TimeUnit.MILLISECONDS)
		.log().all();
	}

}
