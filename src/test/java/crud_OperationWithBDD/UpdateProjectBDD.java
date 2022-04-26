package crud_OperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectBDD {
	
	@Test
	public void updateProjectBDD()
	{
				
		//Step 1: Create the pre requisites - request body
				JSONObject jobj= new JSONObject();
				jobj.put("createdBy", "Lekhana");
				jobj.put("projectName", "pupil");
				jobj.put("status", "Completed");
				jobj.put("teamSize", 10);
				
				baseURI="http://localhost";
				port=8084;
				
				given()
				 .body(jobj)
				 .contentType(ContentType.JSON)
				 
				.when()
				  .put("/projects/TY_PROJ_809")
				  
				.then()
				  .assertThat().statusCode(200)
				  .contentType(ContentType.JSON)
				  .log().all();

	}

}
 