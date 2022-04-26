package differentwaysToPOST;

import org.testng.annotations.Test;

import commonLibrary.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectUsingHashMap {
	
	@Test
	public void createProjectUsingHashMap()
	{
		JavaLibrary jLib = new JavaLibrary();
		baseURI="http://localhost";
		port=8084;
		
		//Step 1: Create Pre requisite
		HashMap map = new HashMap();
		map.put("createdBy", "Sinchana");
		map.put("projectName", "C37"+jLib.getRandomNumber());
		map.put("status", "Completed");
		map.put("teamSize", 3);
		
		given()
		 .body(map)
		 .contentType(ContentType.JSON)
		 
		 .when()
		  .post("/addProject")
		  
		 .then()
		  .assertThat().statusCode(201)
		  .log().all();
	}

}
