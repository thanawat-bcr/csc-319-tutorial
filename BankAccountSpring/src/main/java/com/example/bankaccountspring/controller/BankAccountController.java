package com.example.bankaccountspring.controller;

import com.example.bankaccountspring.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class BankAccountController {
    @Autowired
    private BankAccountRepository accounts;
    public static final String BANK_ACCOUNT_CONTROLLER_PATH = "/account";
    public static final String BANK_ACCOUNTS_CONTROLLER_PATH = "/accounts";
    public static final String BANK_ACCOUNT_CONTROLLER_DEPOSIT_PATH = "/deposit";
    public static final String BANK_ACCOUNT_CONTROLLER_WITHDRAW_PATH = "/withdraw";
    public static final String BANK_ACCOUNT_CONTROLLER_TRANSFER_PATH = "/transfer";

    private static final String ACCOUNT_ID_PARAMETER = "";
    private static final String ACCOUNT_ID_2_PARAMETER = "";
    private static final String AMOUNT_PARAMETER = "";


    @RequestMapping(value=BANK_ACCOUNTS_CONTROLLER_PATH, method= RequestMethod.GET)
    public @ResponseBody Collection<BankAccount> getBankAccounts() {
        return accounts.getBankAccounts();
    }

    @RequestMapping(value=BANK_ACCOUNT_CONTROLLER_PATH, method= RequestMethod.GET)
    public @ResponseBody BankAccount findByTitle(@RequestParam(ACCOUNT_ID_PARAMETER) String accountId){
        return accounts.getBankAccount(accountId);
    }

    @RequestMapping(value=BANK_ACCOUNT_CONTROLLER_PATH, method= RequestMethod.POST)
    public @ResponseBody boolean addBankAccount(BankAccount b) {
        return accounts.addBankAccount(b);
    }

    @RequestMapping(value=BANK_ACCOUNT_CONTROLLER_DEPOSIT_PATH, method= RequestMethod.POST)
    public @ResponseBody boolean deposit(@RequestParam(ACCOUNT_ID_PARAMETER) String id, @RequestParam(AMOUNT_PARAMETER) double amount) {
        return accounts.deposit(id, amount);
    }

    @RequestMapping(value=BANK_ACCOUNT_CONTROLLER_WITHDRAW_PATH, method= RequestMethod.POST)
    public @ResponseBody boolean withdraw(@RequestParam(ACCOUNT_ID_PARAMETER) String id, @RequestParam(AMOUNT_PARAMETER) double amount) {
        return accounts.withdraw(id, amount);
    }
    @RequestMapping(value=BANK_ACCOUNT_CONTROLLER_TRANSFER_PATH, method= RequestMethod.POST)
    public @ResponseBody boolean transfer(@RequestParam(ACCOUNT_ID_PARAMETER) String id1, @RequestParam(ACCOUNT_ID_2_PARAMETER) String id2, @RequestParam(AMOUNT_PARAMETER) double amount) {
        return accounts.transfer(id1, id2, amount);
    }

}
