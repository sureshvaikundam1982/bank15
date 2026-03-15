package com.bank.transaction_service.controller;



import com.bank.transaction_service.model.Transaction;
import com.bank.transaction_service.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping("/create")
    public Transaction create(@RequestBody Transaction transaction) {
        return service.createTransaction(transaction);
    }

    @GetMapping("/account/{accountId}")
    public List<Transaction> getByAccount(@PathVariable Long accountId) {
        return service.getByAccountId(accountId);
    }

    @GetMapping("/all")
    public List<Transaction> getAll() {
        return service.getAllTransactions();
    }
}
