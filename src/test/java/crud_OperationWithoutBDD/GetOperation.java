package crud_OperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetOperation {

	
	@Test
	public void getAllProjectTest()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		System.out.println(resp.asString());
	}
	}
 