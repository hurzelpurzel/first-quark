package de.pottmeier;

import javax.enterprise.context.ApplicationScoped;
import io.quarkus.test.Mock;

@Mock
@ApplicationScoped
public class MockGreetingService extends GreetingService {

	@Override
	public String greeting(String name) {
		return "hello " + name + " <<<<<<<<<< from mock greeting >>>>>>>>>>";
	}
}
