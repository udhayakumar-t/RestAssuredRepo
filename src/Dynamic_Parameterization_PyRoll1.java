
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

import files.ReUsableMethods;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Dynamic_Parameterization_PyRoll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		/*
		 * String response=given().log().all().queryParam("key",
		 * "qaclick123").header("Content-Type","application/json")
		 * .body(payload.AddPlace()).when().post("maps/api/place/add/json")
		 * .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		 * .header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		 */
	
	String response=given().header("Content-Type","application/json")
			.body(payload.AddBook()).when().post("/Library/Addbook.php")
			.then().log().all().assertThat().statusCode(200).extract().response().asString();
	
	JsonPath result_validation=ReUsableMethods.rawToJson(response);
	
	System.out.println(result_validation.get("Msg").toString());
}
}
