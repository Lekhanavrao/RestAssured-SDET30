package parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {
	
	@Test
	public void formParameter()
	{
		
		baseURI ="http://localhost";
		port = 8084;
		
		given()
		 .formParam("createdBy", "Chandan")
		 .formParam("projectName", "Delll")
		 .formParam("status", "Completed")
		 .formParam("teamSize", "3")
		 .contentType(ContentType.JSON)
		 
		 //action
		  .when()
		   .post("/addProject")
		   
		 //validation
		    .then().log().all();
		
		
		
		
		
		
	}

}
