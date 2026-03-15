package com.bank.account_service.service;



import com.bank.account_service.model.Account;
import com.bank.account_service.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repo;

    public Account create(Account account) {
        return repo.save(account);
    }

    public List<Account> getAll() {
        return repo.findAll();
    }
}
