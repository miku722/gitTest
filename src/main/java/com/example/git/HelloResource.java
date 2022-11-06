package com.example.git;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")

    public String hello() {
        for (int i = 0; i < 100; i++){
            System.out.println("i love you %s" +i);
        }
        return "Hello, World!";
    }
}