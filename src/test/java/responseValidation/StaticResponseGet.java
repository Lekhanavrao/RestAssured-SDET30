package responseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseGet {
	
	@Test
	public void staticResponseGet()
	{
		//pre requisite
		String expdata="TY_PROJ_001";
		baseURI="http://localhost";
		port=8084;
		
		//action
		Response res = when()
		   .get("/projects");
		
		//validation
		 String actdata = res.jsonPath().get("[0].projectId");
		 Assert.assertEquals(actdata, expdata);
		 res.then().log().all();
	}

}
