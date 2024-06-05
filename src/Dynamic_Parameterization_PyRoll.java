
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

public class Dynamic_Parameterization_PyRoll {

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
	
	RequestSpecification specification=given().header("Content-Type","application/json").body("{\r\n"
			+ "\"name\":\"Automation with Java\",\r\n"
			+ "\"isbn\":\"bcd\",\r\n"
			+ "\"aisle\":\"345566\",\r\n"
			+ "\"author\":\"Udhayakumar\"\r\n"
			+ "}");
	//Response responseDetails=specification.when().post("/Library/Addbook.php").thenReturn();
		
	Response responseDetails=specification.when().post("/Library/Addbook.php").thenReturn();
	System.out.println(responseDetails.jsonPath().get("Msg").toString());
	/*.when().post("/Library/Addbook.php").thenReturn();
			
	System.out.println(response.jsonPath().prettify());
	*/
//	ValidatableResponse responseBody=responseDetails.then().assertThat().statusCode(200);
//	System.out.println(responseBody.extract().response().asString());
}
}
