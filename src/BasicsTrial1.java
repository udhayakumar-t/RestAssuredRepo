import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import files.payload;
import groovyjarjarantlr4.v4.parse.BlockSetTransformer.setAlt_return;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicsTrial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "https://simple-grocery-store-api.glitch.me";
		RestAssured.basePath="/carts";
		
		/* It will return a requestSpecification whihc in a interface
		Specify a String request body (such as e.g. JSON or XML) that'll be sent with the request. This works for thePOST and PUT methods only. Trying to do this for the other http methods will cause an exception to be thrown. 

		Example of use: 
		 given().body("{ \"message\" : \"hello world\"}").when().post("/json").then().assertThat().body(equalTo("hello world"));
		 
		This will POST a request containing JSON to "/json" and expect that the response body equals to "hello world".
*/		
		
		RequestSpecification reqSpecification=given().header("Content-Type","application/json");
		/*
		 * JsonPath jsonpath=response.jsonPath(); System.out.println(jsonpath);
		 * 
		 * String output=jsonpath.getString("place_id"); System.out.println(output);
		 */
		
		
		//Response is an interface that extends ResponseBody interface
		Response response=reqSpecification.request(Method.POST);
		
		//To get the output as body
		
		System.out.println("*************************************************");
		System.out.println();System.out.println();
		System.out.println("To get the output as body");
		System.out.println("-------------------------------");
		String string=response.asPrettyString();
		System.out.println(string);
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().jsonPath().getString("cartId"));
	}

}
