package com.soemardjo.bankingservices.web;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import lombok.extern.java.Log;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;

// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Log
public class TransactionComponentTest {
    @LocalServerPort
    public int port = 8083;


    @BeforeAll
    public static void setup() {
        RestAssuredMockMvc.standaloneSetup(new TransactionController());
    }

    @Test
    public void testApplicationEndToEnd() {
        log.info("Inside End to End Test");

       given().
               get(String.format("http://localhost:%s/transactions/0", port))
       .then()
                .statusCode(Matchers.is(200));
    }
}
