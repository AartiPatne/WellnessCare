package Authentication;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.generic_utility.EndPoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.ProjectLibrary;


public class BranchControllerDemo {
	@Test(dataProvider="fetchDataProvider")
	public void branchControllerDemo1(String address,String name)
	{
		baseURI="http://localhost:8080";
		ProjectLibrary plib=new ProjectLibrary(address,name);
		Response res1=given().body(plib).contentType(ContentType.JSON)
				.when().post(EndPoints.create);
		        res1.then().log().all();
		        
//      Response res2=given().body(plib).contentType(ContentType.JSON)
//					.when().get(EndPoints.getcreate);
//				        res2.then().log().all();
//				        
//	   Response res3=given().body(plib).contentType(ContentType.JSON)
//					   .when().get(EndPoints.getcreate1);
//					   res3.then().log().all();
//	   Response res4=given().body(plib).contentType(ContentType.JSON)
//						.when().get(EndPoints.getcreate2);
//			   res4.then().log().all();
//	    Response res5=given().body(plib).contentType(ContentType.JSON)
//						.when().put(EndPoints.putcreate);
//					res5.then().log().all();
//	    Response res6=given().body(plib).contentType(ContentType.JSON)
//						.when().delete(EndPoints.deletecreate);
//						 res6.then().log().all();
	}
	
	@DataProvider
	public Object[][]fetchDataProvider()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="Banglore";
		obj[0][1]="Sunny";
		
		
		
		obj[1][0]="Goa";
		obj[1][1]="Om";
		
		
		
		return obj;
	}
		        

}
