package org.dexter.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AccountService {
    private Map<Integer,Account> accountMap = new HashMap<>();

    public void createAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
       // System.out.println("Creating account for : "+getAccount(account.getAccountNumber()));
    }

    public void closeAccount(Account account){
        System.out.println("Deleting account for : " +getAccount(account.getAccountNumber()));
        accountMap.remove(account.getAccountNumber());
    }

    public  Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }


}
