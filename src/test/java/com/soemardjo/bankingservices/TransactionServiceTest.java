package com.soemardjo.bankingservices;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;


public class TransactionServiceTest {

    /* Shared Service */
    static TransactionService service = null;

    @BeforeAll
    static void setup() {
        service = new TransactionService();
    }

    @Test
    void testFindAllByAccountNumber() {

        List<Transaction> result = service.findAllByAccountNumber(0);
        Assertions.assertTrue(result.size() > 0);
    }

    @AfterAll
    static void tearDown() {
        // Shut down the TransactionService
    }
}