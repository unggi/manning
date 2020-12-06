package com.soemardjo.bankingservices;

import com.soemardjo.bankingservices.Transaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("transactionService")
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(Long accountNumber) {
        List<Transaction> list = new ArrayList<Transaction>();
        return list;
    }
}