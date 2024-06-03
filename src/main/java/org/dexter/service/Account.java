package org.dexter.service;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Account {
    private String full_name;
    private int accountNumber;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    private BigDecimal totalAmount;


    @Override
    public String toString() {
        return "Account{" +
                "full_name='" + full_name + '\'' +
                ", accountNumber=" + accountNumber +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
