package com.example.bankaccountspring.repository;

import com.example.bankaccountspring.controller.BankAccount;

import java.util.Collection;

public interface BankAccountRepository {
    public boolean addBankAccount(BankAccount b);
    public BankAccount getBankAccount(String id);
    public Collection<BankAccount> getBankAccounts();
    public boolean deposit(String id, double amount);
    public boolean withdraw(String id, double amount);
    public boolean transfer(String id1, String id2, double amount);
}
