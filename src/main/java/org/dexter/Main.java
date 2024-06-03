package org.dexter;

import org.dexter.config.AppConfig;
import org.dexter.service.Account;
import org.dexter.service.AccountService;
import org.dexter.service.TransactionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Account account = new Account();


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Account account =  context.getBean(Account.class);
        AccountService accountService =  context.getBean(AccountService.class);
        Account account1 =  context.getBean(Account.class);
        TransactionService transactionService = context.getBean(TransactionService.class);


        account.setAccountNumber(1234567);
        account.setFull_name("Sulaimon Muhammed");
        account.setTotalAmount(BigDecimal.valueOf(30000));
        accountService.createAccount(account);
        account1.setFull_name("Jimoh John");
        account1.setAccountNumber(234567);
        account1.setTotalAmount(BigDecimal.valueOf(5000));
        accountService.createAccount(account1);
//        accountService.closeAccount(account);

        //deposit money
        transactionService.Deposit(BigDecimal.valueOf(10000),1234567,accountService);
        transactionService.Deposit(BigDecimal.valueOf(500),234567,accountService);
        // transfer money
        transactionService.Transfer(BigDecimal.valueOf(1000), 1234567,accountService);
        transactionService.Transfer(BigDecimal.valueOf(1000000),234567,accountService);


    }
}