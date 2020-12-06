package com.soemardjo.bankingservices.web;

import com.soemardjo.bankingservices.web.TransactionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Import(TransactionController.class)
public class TransactionControllerTest {
    @Autowired
    private TransactionController transactionController;

    @Test
    void testFindAllByAccountNumber() {
        var list = transactionController.findAllByAccountNumber(0);
        assertEquals(list.size(), 0);
    }
}
