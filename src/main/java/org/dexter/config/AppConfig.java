package org.dexter.config;

import org.dexter.service.Account;
import org.dexter.service.AccountService;
import org.dexter.service.TransactionService;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.dexter")
public class AppConfig {

    @Bean
    public AccountService accountService(){
        return new AccountService();
    }
    @Bean
    public TransactionService transactionService(){
        return  new TransactionService();
    }


    @Bean
    @Scope("prototype")
    public Account account(){
        return new Account();
    }
}
