package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import io.restassured.http.ContentType;

public class PutWithBdd extends BaseClass{
	@Test
	public void putBranchController()
	{
	 baseURI = "http://localhost:8080";
	 JSONObject object=new JSONObject();
	 object.put("address", "Goa");
	 object.put("name","Om");
	 
	 
	 
	 
	  given()
	 
	  .contentType(ContentType.JSON)
	  .body(object)
	  .when()
	  .put("/hospital/branch/13")
	  .then()
	  .assertThat().statusCode(200)
	  .log().all();
	 
	}
}
