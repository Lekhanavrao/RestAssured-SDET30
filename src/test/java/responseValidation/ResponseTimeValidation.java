package responseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {
	
	@Test
	public void responseTimeValidation()
	{
		
		//prerequisites
		baseURI="http://localhost";
		port=8084;
		
		//Action
		when()
				
		 .get("/projects")
		 
		 //validate
		.then()
		   .assertThat().time(Matchers.lessThan(5000L), TimeUnit.MILLISECONDS)
		   .log().all();
		
		 
	}

}
