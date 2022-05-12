package com.example.bankaccountspring.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BankAccount {
    String name;
    String accountId;
    String branch;
    double amount;
}
