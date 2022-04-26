package crud_OperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectBDDTest {

	@Test
	public void createProjectBDDTest()
	{
		
		//Step 1: Create the pre requisites - request body
				JSONObject jobj= new JSONObject();
				jobj.put("createdBy", "Nithin");
				jobj.put("projectName", "pupilpod1");
				jobj.put("status", "Completed");
				jobj.put("teamSize", 11);
				
				baseURI="http://localhost";
				port=8084;
				
				given()
				 .body(jobj)
				 .contentType(ContentType.JSON)
				 
				 
			     .when()
			     .post("/addProject")
			     
			     
			     .then()
			     .assertThat()
			     .statusCode(201)
			     .contentType(ContentType.JSON)
			     .log()
			     .all();
		
				
				
		
		
	}
}
