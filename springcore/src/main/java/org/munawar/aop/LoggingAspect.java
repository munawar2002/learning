package org.munawar.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethod()")
    public void loggingAdvice(){
        System.out.println("Logging Advice Method Called.");
    }

    @Pointcut("within(org.munawar.aop..*)")
    public void allCircleMethod(){

    }
}
