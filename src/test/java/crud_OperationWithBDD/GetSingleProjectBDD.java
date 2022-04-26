package crud_OperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleProjectBDD {
	
	@Test
	public void getSingleProject()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
		 .get("/projects/TY_PROJ_804")
		.then()
		 .log().all();
	}

}
