package com.bank.account_service.controller;



import com.bank.account_service.model.Account;
import com.bank.account_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping
    public Account create(@RequestBody Account account) {
        return service.create(account);
    }

    @GetMapping
    public List<Account> getAll() {
        return service.getAll();
    }

    @GetMapping("/test")
    public String test() {
        return "Account Service Working";
    }
}
