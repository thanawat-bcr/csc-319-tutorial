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
    public @ResponseBody Bankaccount getAccountByNumber(@RequestParam("accountnumber") String accountnumber) {
        return banking.findByAccountnumber(accountnumber);
    }

    @RequestMapping(value = "/accounting/listAllAccount", method = RequestMethod.GET)
    public @ResponseBody Collection<Bankaccount> getAllAccounts() {
        return banking.findAll();
    }

    @RequestMapping(value = "/accounting/updateAccount", method = RequestMethod.POST)
    public @ResponseBody boolean updateAccount(@RequestParam("accountnumber") String accountnumber, @RequestParam("newamount") double newamount) {
        Bankaccount tmp = banking.findByAccountnumber(accountnumber);
        tmp.setAmount(newamount);
        banking.save(tmp);
        return true;
    }

    @RequestMapping(value = "/accounting/transfer", method = RequestMethod.POST)
    public @ResponseBody boolean transfer(@RequestParam("accountnumber1") String accountnumber1, @RequestParam("accountnumber2") String accountnumber2, @RequestParam("amount") double amount) {
        Bankaccount acc1 = banking.findByAccountnumber(accountnumber1);
        Bankaccount acc2 = banking.findByAccountnumber(accountnumber2);
        if (acc1.getAmount() < amount) {
            return false;
        }
        acc1.setAmount(acc1.getAmount() - amount);
        acc2.setAmount(acc2.getAmount() + amount);
        banking.save(acc1);
        banking.save(acc2);
        return true;
    }
}
