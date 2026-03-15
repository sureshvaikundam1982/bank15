package com.bank.transaction_service.service;



import com.bank.transaction_service.model.Transaction;
import com.bank.transaction_service.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public Transaction createTransaction(Transaction transaction) {

        transaction.setStatus("SUCCESS");

        return repository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public List<Transaction> getByAccountId(Long accountId) {
        return repository.findByAccountId(accountId);
    }
}
