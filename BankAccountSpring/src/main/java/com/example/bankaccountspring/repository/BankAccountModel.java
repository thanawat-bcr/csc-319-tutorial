package com.example.bankaccountspring.repository;

import com.example.bankaccountspring.controller.BankAccount;

import java.util.ArrayList;
import java.util.Collection;

public class BankAccountModel implements BankAccountRepository {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    @Override
    public boolean addBankAccount(BankAccount b) {
        return accounts.add(b);
    }

    @Override
    public BankAccount getBankAccount(String id) {
        for (BankAccount b: accounts) {
            if (b.getAccountId().equals(id)) return b;
        }
        return null;
    }

    @Override
    public Collection<BankAccount> getBankAccounts() {
        return accounts;
    }

    @Override
    public boolean deposit(String id, double amount) {
        BankAccount b = getBankAccount(id);
        double current = b.getAmount();
        b.setAmount(current + amount);
        return true;
    }

    @Override
    public boolean withdraw(String id, double amount) {
        BankAccount b = getBankAccount(id);
        double current = b.getAmount();
        if (current < amount) return false;
        b.setAmount(current - amount);
        return true;
    }

    @Override
    public boolean transfer(String id1, String id2, double amount) {
        BankAccount b1 = getBankAccount(id1);
        BankAccount b2 = getBankAccount(id2);
        System.out.println(id1 + " " + id2 + " " + amount);
        if (b1.getAmount() < amount) return false;
        b1.setAmount(b1.getAmount() - amount);
        b2.setAmount(amount + b2.getAmount());
        return true;
    }
}
