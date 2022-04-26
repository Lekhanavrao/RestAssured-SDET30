package crud_OperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest {

	@Test
	public void getAllProjects()
	{
		//Step 1:Create Pre requisite
		
		//step 2:Perform action
	Response res = RestAssured.get("http://localhost:8084/projects");
		
		//Step 3: Validation
		System.out.println(res.contentType());
		System.out.println(res.asString());
		System.out.println(res.asPrettyString());


	}
}
