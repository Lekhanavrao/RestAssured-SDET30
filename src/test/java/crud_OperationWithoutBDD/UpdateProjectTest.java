package crud_OperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class UpdateProjectTest {
	
	@Test
	public void updateProject()
	{
		//Step 1: Create the pre requisites - request body
				JSONObject jobj= new JSONObject();
				jobj.put("createdBy", "Lekhana");
				jobj.put("projectName", "pupilpod");
				jobj.put("status", "Completed");
				jobj.put("teamSize", 12);
				
			//Step 2: Perform action	
				RequestSpecification req = RestAssured.given();
				req.body(jobj);
				req.contentType(ContentType.JSON);
				Response res = req.put("http://localhost:8084/projects/TY_PROJ_804");
						
		 //Step 3: Validation
			int status = res.getStatusCode();
			Assert.assertEquals(status, 200);
			res.then().log().all();
	}
	
	

}
