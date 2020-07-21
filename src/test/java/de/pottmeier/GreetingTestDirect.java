package de.pottmeier;

import static org.junit.jupiter.api.Assertions.*;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingTestDirect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger("GreetingTestDirect");

    @Inject 
    GreetingService service;

	@Test
	void testGreeting() {
		LOGGER.info("greeting: " + service.greeting("Quarkus"));
		Assertions.assertTrue(service.greeting("Quarkus").startsWith("hello Quarkus"));
	}

}
