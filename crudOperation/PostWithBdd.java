package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class PostWithBdd extends BaseClass{
	@Test
public void postBranchController()
          
	     {
		 baseURI="http://localhost:8080";
		 JSONObject Object = new JSONObject();
	     Object.put("address","Banglore");
	     Object.put("name","Sunny");
	     
	     
	     
	     given()
	     .contentType(ContentType.JSON)
	     .body(Object)
	     .when()
	     .post("/hospital/branch")
	     .then()
	     .assertThat().statusCode(200)
	     .log().all();
	     
		
	     }
		               

	

}
