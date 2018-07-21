package org.amunawar.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect {

    @Before("allCircleMethod()")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println(joinPoint.toString());
    }

    @Before("args(String))")
    public void stringArgumentMethods(){
        System.out.println("A method that takes string as argument");
    }

    @Before("args(name))")
    public void stringArgumentMethods(String name){
        System.out.println("Argument passed to method is :"+name);
    }


    @Pointcut("execution(* get*())")
    public void allGetters(){
    }

    @Around("allGetters()")
    public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try { // proceedingJoinPoint is necessory paramter.
            System.out.println("Before Around");
            //Before proceed method. Do here Something you want to do before method execution
            proceedingJoinPoint.proceed();
            //After proceed method. Do here Something you want to do After method execution
            System.out.println("After Returning");
        }catch (Throwable e){
            System.out.println("After throwing");
        }
        System.out.println("After Finally");
    }

    @Pointcut("within(org.munawar.aop..*)")
    public void allCircleMethod(){
    }

}
