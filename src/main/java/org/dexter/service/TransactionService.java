package org.dexter.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class TransactionService {
    public void Deposit(BigDecimal amount, int accountNumber, AccountService accountService){

        Account account =  accountService.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
      //  System.out.println(amount+" successfully deposited for : "+ account);

    }

    public void Transfer(BigDecimal amount , int accountNumber, AccountService accountService){
        Account account = accountService.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
