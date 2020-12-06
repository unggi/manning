package com.soemardjo.bankingservices;

import java.net.URI;
import lombok.Data;

@Data
public class Transaction {
    int type;
    Long accountNumber;
    String currency;
    Long amount;
    String merchantName;
    URI merchantLogo;
}