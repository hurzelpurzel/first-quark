package de.pottmeier;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @GET    
    @Path("{uuid}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting( @PathParam("uuid") String uuid) {
        return "hello "+uuid;
    }
}