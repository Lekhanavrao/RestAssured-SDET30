package differentwaysToPOST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import commonLibrary.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectusingJSONObject {
	
	@Test
	public void createProjectusingJSONObject()
	{
		JavaLibrary jLib = new JavaLibrary();
		

		//Step 1: Create the pre requisites - request body
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "Kirana");
		jobj.put("projectName", "VET "+jLib.getRandomNumber());
		jobj.put("status", "Completed");
		jobj.put("teamSize", 16);
		
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		 
		.when()
		 .post("/addProject")
		 
		.then()
		 .assertThat().statusCode(201)
		 .log().all();
	}

}
