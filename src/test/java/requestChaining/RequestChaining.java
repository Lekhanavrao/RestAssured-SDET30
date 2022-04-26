package requestChaining;

import org.testng.annotations.Test;

import commonLibrary.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import projectLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class RequestChaining {
	
	@Test
	public void requestChaining()
	{
			//Step 1: Create a projiect using POJO
			JavaLibrary jlib = new JavaLibrary();
			ProjectLibrary plib = new ProjectLibrary("Shashi", "Qspider", "On Going", 2);
			baseURI ="http://localhost";
			port = 8084;
			
			Response res = given()
			 .body(plib)
			 .contentType(ContentType.JSON)
			 
			.when()
			 .post("/addProject");
			
			//capture the projectid
			String proId = res.jsonPath().get("projectId");
			System.out.println(proId);
			res.then().log().all();
			
			//Create a get request and post proId as path parameter
			given()
			 .pathParam("pid", proId)
			.when()
			 .get("/projects/{pid}")
			.then()
			 .assertThat().statusCode(200).log().all();
	}

}
