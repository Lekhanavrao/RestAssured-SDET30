package commonLibrary;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;


/**
 * this class consists of generic methods related to restassured
 * @author User1
 *
 */
public class RestAssuredLibrary {
	
	
	/**
	 * This method will return the json path
	 * @param resp
	 * @param jsonPath
	 * @return
	 */
	public String getJsonPath(Response resp, String jsonPath)
	{  
		String value = resp.jsonPath().get(jsonPath);
		return value;
      
	}

}