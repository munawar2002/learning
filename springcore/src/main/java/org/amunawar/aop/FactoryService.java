package org.amunawar.aop;

/**
 * Created by sheik on 7/21/2018.
 */
public class FactoryService {

    public Object getBean(String beanType){
        if(beanType.equalsIgnoreCase("shapeService")) return new ShapeService();
        if(beanType.equalsIgnoreCase("triangle")) return new Triangle();
        if(beanType.equalsIgnoreCase("circle")) return new Circle();
        return null;
    }

}
