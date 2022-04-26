package crud_OperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	
	@Test
	public void getSingleProject()
	{
		//Step 1:Create Pre requisite
		
		//step 2:Perform action
		Response res = RestAssured.get("http://localhost:8084/projects/TY_PROJ_804");
		
		//Step 3: Validation
		res.then().log().all();
		
	}

}
