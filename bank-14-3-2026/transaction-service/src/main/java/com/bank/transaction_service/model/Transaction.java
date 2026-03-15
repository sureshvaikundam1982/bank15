package com.bank.transaction_service.model;


import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accountId;

    private String type;

    private double amount;

    private String status;

    public Long getId() { return id; }

    public Long getAccountId() { return accountId; }

    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
