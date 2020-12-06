package com.soemardjo.bankingservices.service;

import com.soemardjo.bankingservices.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("transactionService")
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(final Integer  accountNumber) {
        return new ArrayList<>();
    }
}