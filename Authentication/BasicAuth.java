package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class BasicAuth {
	@Test
	public void basicAuth()
	{
		baseURI="https://github.com/" ;
		
		given().auth().basic("AartiPatne", "Aarti@1399")
		.when().get("/login")
		.then().log().all();
	}

}
