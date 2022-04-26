package differentwaysToPOST;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import commonLibrary.JavaLibrary;
import io.restassured.http.ContentType;
import projectLibrary.ProjectLibrary;

public class CreateProjectUsingPOJOClass {

	@Test
	public void createProjectUsingPOJOClass(){
		
		
		JavaLibrary jLib = new JavaLibrary();
		 
		baseURI="http://localhost";
		port=8084;
		
		//Step 1: Create pre requisite
		ProjectLibrary pLib = new ProjectLibrary("Kirana", "API"+jLib.getRandomNumber(), "Completed", 5);
		
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		 
	//Step 2: perform action	 
		.when()
		  .post("/addProject")
		  
    //Step 3: Validation
		.then()
		   .assertThat().statusCode(201)
		   .log().all();
		  
				
		
		
	}
	
	
	
	
}
