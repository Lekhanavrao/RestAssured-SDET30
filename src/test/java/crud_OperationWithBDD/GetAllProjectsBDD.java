package crud_OperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjectsBDD {

	@Test
	public void GetAllProjects()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
		 .get("/projects")
		.then()
		 .log().all();
	}
	
	
}
