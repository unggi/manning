package com.soemardjo.bankingservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/transactions", produces="application/json")
@CrossOrigin(origins = "*")
@Component("transactionController")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    public TransactionController() {

    }

    @GetMapping("/{account}")
    public List<Transaction> findAllByAccountNumber(@PathVariable("account") Integer account) {
        return transactionService.findAllByAccountNumber(account);
    }
}
