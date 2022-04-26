package differentwaysToPOST;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONFile {
	
	@Test
	public void createProjectUsingJSONFile()
	{
		//Step 1: Create pre requisite
		File file = new File("./Data.json");
		baseURI="http://localhost";
		port=8084;
		
		given()
		 .body(file)
		 .contentType(ContentType.JSON)
	
    //Step 2: Perform action
		 .when()
		  .post("/addProject")
	
     //Step 2: validation 
		  .then()
		   .assertThat().statusCode(201)
		   .log().all();
	}

}
