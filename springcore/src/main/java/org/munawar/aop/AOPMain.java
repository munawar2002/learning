package org.munawar.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
        ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
        System.out.println(shapeService.getTriangle().getName());

    }
}
