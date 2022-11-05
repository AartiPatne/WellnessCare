package crudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

public class DeleteWithBdd extends BaseClass {
	@Test
	
  public void deleteBranchController()
  {
	
	baseURI="http://localhost:8080";
	
	
	 when()
	 .delete("/hospital/branch?id=1")
	 
	 .then()
	 .assertThat().statusCode(404)
	 .log().all();
  }

}
