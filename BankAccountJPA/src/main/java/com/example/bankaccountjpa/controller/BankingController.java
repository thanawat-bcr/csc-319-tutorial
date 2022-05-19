package com.example.bankaccountjpa.controller;

import com.example.bankaccountjpa.repository.Bankaccount;
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
    public @ResponseBody boolean addAccount(@RequestBody Bankaccount acc) {
        banking.save(acc);
        return true;
    }

    @RequestMapping(value = "/accounting/searchAccount", method = RequestMethod.GET)
    public @ResponseBody Collection<Bankaccount> getAccountByNumber(@RequestParam("accountnumber") String accountnumber) {
        return banking.findByAccountnumber(accountnumber);
    }

    @RequestMapping(value = "/accounting/listAllAccount", method = RequestMethod.GET)
    public @ResponseBody Collection<Bankaccount> getAllAccounts() {
        return banking.findAll();
    }
}
