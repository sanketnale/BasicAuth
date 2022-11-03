package crudeoperation;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import static io.restassured.RestAssured.*;

public class GetWithBDD extends BaseClass {
	
	
	@Test
	public void getwithBDD() {
		baseURI="http://localhost:8080";
		
		when()
		.get("/products")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
