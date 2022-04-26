package auntentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0 {
	
	@Test
	public void oauth2_0()
	{
		//Create a request to generate access token
		Response res = given()
		 .formParam("client_id", "SDET-30Rest")
		 .formParam("client_secret", "f3ca5f222a452783ae9363637fec4625")
		 .formParam("grant_type", "client_credentials")
		 .formParam("redirect_uri", "http://lekhana.com")
		 .formParam("code", "authorization_code")
		 
		 .when()
		   .post("http://coop.apps.symfonycasts.com/token");
		  
		  //Capture the access token from the response
		String token = res.jsonPath().get("access_token");
				System.out.println(token);
				
		//Create another request and use the token to access the API
		given()
		 .auth().oauth2(token)
		 .pathParam("USER_ID", 3108)
		 
		.when()
		  .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
		  .then().log().all();
		
		    
	}

}
