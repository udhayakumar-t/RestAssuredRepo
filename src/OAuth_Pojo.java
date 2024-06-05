import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.API;
import Pojo.GetCourse;
import files.ReUsableMethods;
import files.payload;

public class OAuth_Pojo {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String response =
            given().formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                    .formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                    .formParams("grant_type", "client_credentials")
                    .formParams("scope", "trust")
                    .when().log().all()
                    .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
	System.out.println(response);
	JsonPath jsonPath = new JsonPath(response);
    String accessToken = jsonPath.getString("access_token");
    System.out.println(accessToken);
	
	  
	String getResponse= given()
	  	  .queryParams("access_token", accessToken)
	  	  .when()
	  	  .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").asString();
	JsonPath jsonpath=ReUsableMethods.rawToJson(getResponse);
	ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	GetCourse gc=objectMapper.readValue(getResponse, GetCourse.class);
	System.out.println(gc.getInstrutor());
	System.out.println(gc.getExpertise());
	/*
	 * System.out.println(gc.getCourses().getApi().get(0).getCourseTitle());
	 * System.out.println(gc.getCourses().getApi().get(0).getPrice());
	 */
	List<API> apiCourses=gc.getCourses().getApi();
	for(API s: apiCourses) {
		System.out.println(s.getCourseTitle());
		System.out.println(s.getPrice());
	}

	}

}
