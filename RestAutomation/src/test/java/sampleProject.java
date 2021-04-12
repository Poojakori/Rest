import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.jayway.restassured.path.json.JsonPath;


public class sampleProject {
    @Test
    public void getSample() {

        //Dependencies - rest-assured, hamcrest, Jackson-databind and TestNG

//		given()
//		 - Requestbody
//		 - Parameters
//		 - headers
//		 - authorization
//		when()
//		 - GET,POST, PUT or DELETE
//		then()
//		-Validation - status codes , response body

        given()
        .when()
        .get("http://jsonplaceholder.typicode.com/posts/1")
        .then()
        .extract().response().prettyPrint();
    }

}
