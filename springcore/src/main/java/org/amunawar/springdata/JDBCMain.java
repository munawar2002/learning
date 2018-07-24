package org.amunawar.springdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springData.xml");
        HibernateDaoImpl jdbcDAO = applicationContext.getBean("hibernateDaoImpl",HibernateDaoImpl.class);

        //jdbcDAO.insertCircle(circle);
        System.out.println(jdbcDAO.getCircleCount());
    }
}
