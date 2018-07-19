package org.amunawar.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object beanObject, String beanName) throws BeansException {
        System.out.println("Before Initializing. Bean Name ["+beanName+"]");
        return beanObject;
    }

    public Object postProcessAfterInitialization(Object beanObject, String beanName) throws BeansException {
        System.out.println("After Initializing. Bean Name ["+beanName+"]");
        return beanObject;
    }
}
