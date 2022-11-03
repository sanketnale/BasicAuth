package crudeoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class PostWithBDD extends BaseClass {
	
@Test

public void postWithBDD() {
	baseURI="http://localhost:8080";
			
	JSONObject obj=new JSONObject();
	obj.put("cost", 2555557);
	obj.put("description", "monkey");
	obj.put("id",30);
	obj.put("name", "pillu");
	
	given()
	.contentType(ContentType.JSON)
	.body(obj)
	.when()
	.post("/products")
	.then()
	.assertThat().statusCode(201)
	.log().all();
	

	
	
	
	
}
	
	
	
	
}
