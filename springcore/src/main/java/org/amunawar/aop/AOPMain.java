package org.amunawar.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {



    public static void main(String[] args) {

//        FactoryService factoryService = new FactoryService();
//        ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
        ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
       // System.out.println(shapeService.getCircle().getName());
        shapeService.getCircle();

        //System.out.println(shapeService.getTriangle().getName());


    }
}
