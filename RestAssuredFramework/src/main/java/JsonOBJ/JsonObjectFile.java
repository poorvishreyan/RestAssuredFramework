package JsonOBJ;

import java.util.Random;

import org.json.simple.JSONObject;

public class JsonObjectFile {
	
	public Object jsonObjectFile()
	{
		Random ran = new Random();
		int randomNum = ran.nextInt(100);
		
		JSONObject jsob = new JSONObject();
		jsob.put("createdBy", "Poorvi");
		jsob.put("projectName", "DEll"+randomNum);
		jsob.put("status", "Created");
		jsob.put("teamSize", 23);
		
		return jsob;
	}

}
