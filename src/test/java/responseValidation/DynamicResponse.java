package responseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import projectLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponse {
	
	@Test
	public void dynamicResponse()
	{
		//pre requisite
		String expdata="TY_PROJ_1010";
		baseURI="http://localhost";
		port=8084;
		
		//action
		Response res = when()
		   .get("/projects");
		
		//validation
		boolean flag=false;
		List<String> pid = res.jsonPath().get("projectId");
		for(String projectId:pid)
		{
			if (projectId.equalsIgnoreCase(expdata)) {
				flag=true;
			}
		}
		
		Assert.assertTrue(flag);
		System.out.println("data verified");
		
		res.then().log().all();
		 
				
	}

}
