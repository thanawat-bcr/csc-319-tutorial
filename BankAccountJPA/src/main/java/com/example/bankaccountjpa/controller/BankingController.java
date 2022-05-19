package com.example.bankaccountjpa.controller;

import com.example.bankaccountjpa.repository.BankAccount;
import com.example.bankaccountjpa.repository.BankingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class BankingController {

    @Autowired
    private BankingInterface banking;

    @RequestMapping(value = "/accounting/createAccount", method = RequestMethod.POST)
    public @ResponseBody boolean addAccount(@RequestBody BankAccount acc) {
        banking.save(acc);
        return true;
    }

    @RequestMapping(value = "/accounting/searchAccount", method = RequestMethod.GET)
    public @ResponseBody Collection<BankAccount> getAccountByNumber(@RequestParam("accountNumber") String accountNumber) {
        return banking.findByAccountNumber(accountNumber);
    }

    @RequestMapping(value = "/accounting/listAllAccount", method = RequestMethod.GET)
    public @ResponseBody Collection<BankAccount> getAllAccounts() {
        return banking.findAll();
    }
}
