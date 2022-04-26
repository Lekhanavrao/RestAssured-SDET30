package crud_OperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectBDD {
	
	@Test
	public void deleteProjet()
	{
		baseURI ="http://localhost";
		port = 8084;
		
		when()
		 .delete("/projects/TY_PROJ_806")
		 
		.then()
		 .assertThat().statusCode(204)
		 .log().all();
	}

}
