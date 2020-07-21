package de.pottmeier;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingResourceTest {

	

	@Test
    public void testGreetingEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given()
        .pathParam("name", uuid)
        .when().get("/greeting/{name}")
       .then()
       .statusCode(200).body(startsWith("hello " + uuid));
        
    }
}