package org.dexter.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {



    @Before("afterCreatingAccount()")
    public void logger(){
        System.out.println("Loggers");
    }

    @Pointcut("execution(* org.dexter.service.AccountService.createAccount(..))")
    public void afterCreatingAccount(){

    }

    @Pointcut("execution(* org.dexter.service.TransactionService.Deposit(..))")
    public void afterDeposit(){

    }

    @AfterReturning(pointcut = "afterDeposit()")
    public void afterExecutingDeposit(JoinPoint joinPoint){
      String amount = joinPoint.getArgs()[0].toString();
      String  accountNumber =  joinPoint.getArgs()[1].toString();
        System.out.println("Entering method: depositFunds with parameters:"+ "["+amount+"," +accountNumber+"]");

    }

    @Pointcut("execution(* org.dexter.service.TransactionService.Transfer(..))")
    public  void afterTransfer(){

    }
    @AfterReturning(pointcut = "afterTransfer()")
    public void afterExecutingTransfer(JoinPoint joinPoint){

        String amount = joinPoint.getArgs()[0].toString();
        String  accountNumber =  joinPoint.getArgs()[1].toString();
        System.out.println("Entering in method: depositFunds with parameters:"+ "["+amount+"," +accountNumber+"]");
    }

    @AfterReturning(pointcut = "afterCreatingAccount()")
    public void afterReturningCreatedAccount(JoinPoint joinPoint){
        String Data  = joinPoint.getArgs()[0].toString();
        System.out.println("Entering method: createAccount with parameters : "+Data);

    }


}
