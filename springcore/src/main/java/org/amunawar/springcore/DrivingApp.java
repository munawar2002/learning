package org.amunawar.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrivingApp {
	static final String SPRING_XML_PATH = "C:\\Munawar\\Practice\\Eclipse\\springcore\\src\\main\\resources\\spring.xml";
	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource(SPRING_XML_PATH));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}
