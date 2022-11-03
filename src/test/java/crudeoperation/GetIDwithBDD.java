package crudeoperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

public class GetIDwithBDD extends BaseClass{
   @Test
	public void getidwithBDD() {
		
		
baseURI="http://localhost:8080";
		
		when()
		.get("/products/27")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}
}
