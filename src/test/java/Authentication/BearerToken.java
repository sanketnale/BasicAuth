package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject obj = new JSONObject();
		
		obj.put("name", "BasicAuth");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}
	
}
