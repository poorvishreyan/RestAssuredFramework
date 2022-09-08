package GenericUtilities;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	
	/*
	 * this method will give the json data through json path from response body
	 */

	public String getJsonData(Response response, String path)
	
	{
	String JSONpath=response.jsonPath().getString(path);
	return JSONpath;
	
	}


}

