package de.pottmeier;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    
    public String greeting( String uuid) {
        return "hello "+uuid;
    }
}