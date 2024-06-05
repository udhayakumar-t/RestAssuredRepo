import java.io.File;
import java.io.InputStream;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.common.*;
import io.restassured.module.jsv.JsonSchemaValidator;



public class CreateSchemaValidation {
	public static void main(String[] args) throws Exception{
		RestAssured.baseURI= "https://restful-booker.herokuapp.com";
	//	InputStream createBookingJsonSchema=getClass().getResourceAsStream("CreateBookingSchema.json");
		File file=new File("C:\\Users\\Udhayakumar.Tamilsel\\eclipse-workspace\\RestAssured\\src\\files\\Schemas\\CreateBookingSchema.json");
		ValidatableResponse response=RestAssured.given().header("Content-Type","application/json").body(payload.createBooking()).post("/booking").then()
		.body(JsonSchemaValidator.matchesJsonSchema(file)).assertThat().statusCode(200);
		System.out.println(response.log().all());
		
	}

}
