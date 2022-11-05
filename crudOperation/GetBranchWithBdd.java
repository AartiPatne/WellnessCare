package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

public class GetBranchWithBdd extends BaseClass{
	@Test
	public void getBranchController()
	{
		baseURI="http://localhost:8080";
		
		
		 when()
		 .get("/hospital/branch/7")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();
	}

}
