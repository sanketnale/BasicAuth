package crudeoperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

public class DeleteWithBDD extends BaseClass {
	
	@Test
	public void deletewithBDD() {
		
		baseURI="http://localhost:8080";
				
				when()
				.delete("/products/24")
				
				.then()
				.assertThat().statusCode(200)
				.log().all();
				
			}
		}


    