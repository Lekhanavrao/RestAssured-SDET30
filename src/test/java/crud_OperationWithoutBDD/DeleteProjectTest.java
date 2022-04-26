package crud_OperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
	
	@Test
	public void deleteProject()
	{
		Response resp = RestAssured.delete("http://localhost:8084/projects/");
		
		//Step 3:

	}

}
