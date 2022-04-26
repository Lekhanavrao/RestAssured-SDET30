 package responseValidation;

import org.testng.annotations.Test;

import commonLibrary.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;
import projectLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class StaticResponse {
	
	@Test
	public void staticResponse()
	{
		
		baseURI="http://localhost";
		port=8084;
		
		JavaLibrary jlib = new JavaLibrary();
		ProjectLibrary pobj =new ProjectLibrary("Sinch", "MRI_"+jlib.getRandomNumber(), "On Going", 6);
		
		String expdata="MRI";
		
		Response res = given()
		 .body(pobj)
		 .contentType(ContentType.JSON)
		 
		 .when()
		   .post("/addProject");
		   
		  String actdata = res.jsonPath().get("projectName");
		Assert.assertTrue(actdata.contains(expdata));
		res.then().log().all();
	}

}
