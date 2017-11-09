package com.matthew.onlinebankingdemo.model;

import java.math.BigDecimal;

public class PrimaryAccount {
    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<PrimaryTranaction> primaryTranactionList;
}
