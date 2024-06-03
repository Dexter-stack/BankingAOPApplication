package org.dexter.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionHandlingAspect {

    @AfterThrowing(pointcut = "LogException()", throwing = "ex")
    public void LogOutException(Exception ex){
        System.out.println("Exception occured:" + ex.getMessage());

    }

    @Pointcut("execution(* org.dexter.service.TransactionService.*(..))")
    public void LogException(){

    }





}
