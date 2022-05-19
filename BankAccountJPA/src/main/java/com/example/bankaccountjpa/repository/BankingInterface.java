package com.example.bankaccountjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BankingInterface extends CrudRepository<Bankaccount, String> {
    public Bankaccount findByAccountnumber(String accountnumber);
    public Collection<Bankaccount> findAll();


}
