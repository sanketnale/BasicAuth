package crudeoperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import io.restassured.http.ContentType;

public class PutWithBDD extends BaseClass {
     @Test
	public void putwithBDD() {
	baseURI="http://localhost:8080";
	
	JSONObject obj=new JSONObject();
	obj.put("cost", 55000);
	obj.put("description", "doctor");
	obj.put("id",23);
	obj.put("name", "prajakta");
	
	given()
	.contentType(ContentType.JSON)
	.body(obj)
	.when()
	.put("/products")
	.then()
	.assertThat().statusCode(201)
	.log().all();
	
	
	
}
}
