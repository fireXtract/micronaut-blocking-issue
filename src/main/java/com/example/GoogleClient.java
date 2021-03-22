package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.RequestAttribute;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

import java.util.List;

@Client(id = "goog")
public interface GoogleClient {
    @Get("/")
    @Consumes(MediaType.ALL)
    @RequestAttribute(name = "sample", value = "text")
    Flowable<String> getStrings();
}
