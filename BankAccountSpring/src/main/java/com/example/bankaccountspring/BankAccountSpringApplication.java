package com.example.bankaccountspring;

import com.example.bankaccountspring.controller.BankAccount;
import com.example.bankaccountspring.repository.BankAccountModel;
import com.example.bankaccountspring.repository.BankAccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Collection;

@SuppressWarnings("ALL")
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableWebMvc
@Configuration
public class BankAccountSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountSpringApplication.class, args);
    }

    @Bean
    public BankAccountRepository bankAccountRepository(){ return new BankAccountModel(); }
}
