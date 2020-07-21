package de.pottmeier;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ExampleResourceTest {

	@Test
	public void testHelloEndpoint() {
		given().when().get("/hello").then().statusCode(200).body(is("hello welt"));
	}

	
}