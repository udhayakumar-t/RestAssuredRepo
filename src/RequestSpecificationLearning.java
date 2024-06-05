import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestSpecification requestSpecification;
		requestSpecification = RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking");
		RestAssured
		  .given()
		  .spec(requestSpecification)
		// When
		   .when()
		// Then
		   .then()
		   .statusLine("HTTP/1.1 200 OK");	
	}

}
