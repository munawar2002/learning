package org.munawar.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    public void loggingAdvice(){
        System.out.println("Logging Advice Method Called.");
    }
}
