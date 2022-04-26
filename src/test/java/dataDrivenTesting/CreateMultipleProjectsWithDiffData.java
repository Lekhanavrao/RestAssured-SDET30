package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonLibrary.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import projectLibrary.ProjectLibrary;

public class CreateMultipleProjectsWithDiffData {
	
	@Test(dataProvider = "getdata")
	public void createMultipleProjectsWithDiffData(String createdBy, String projectName, String status, int teamSize)
	{
		JavaLibrary jlib = new JavaLibrary();
		ProjectLibrary plib = new ProjectLibrary(createdBy, projectName+jlib.getRandomNumber(), status, teamSize);
		
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		  .body(plib)
		  .contentType(ContentType.JSON)
		  
		  
		 .when()
		   .post("/addProject")
		   
		  .then().log().all();
		 
		
		
		
	}
	
	@DataProvider(name="getdata")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Lekhan";
		data[0][1] = "HP";
		data[0][2] = "Completed";
		data[0][3] = 5;
		
		data[1][0] = "Nivy";
		data[1][1] = "Dell";
		data[1][2] = "Completed";
		data[1][3] = 6;
		
		data[2][0] = "Bindu";
		data[2][1] = "Sony";
		data[2][2] = "Completed";
		data[2][3] = 7;
		
		return data;
		
	}

}
