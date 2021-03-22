package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

import javax.inject.Inject;

@Controller("/")
@Secured(SecurityRule.IS_ANONYMOUS)
public class TestController {
    @Inject
    private GoogleClient googleClient;

    @Get(uri="/test", produces = MediaType.APPLICATION_JSON_STREAM)
    public String greet(){
        System.out.println("got here");
        return String.join("", googleClient.getStrings().toList().blockingGet());
    }
}
