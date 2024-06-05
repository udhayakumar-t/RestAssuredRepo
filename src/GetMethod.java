import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "https://simple-grocery-store-api.glitch.me";
		//RestAssured.basePath="/carts";
		RequestSpecification reqSpecification=RestAssured.given().header("Content-Type","application/json");
		Response response=reqSpecification.post("/carts").andReturn();
		//JsonPath js=new JsonPath(response.prettyPrint());
		System.out.println(response.getBody().asPrettyString());
		

}
}
