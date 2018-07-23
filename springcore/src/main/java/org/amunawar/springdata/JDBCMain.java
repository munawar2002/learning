package org.amunawar.springdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springData.xml");
        JdbcDAOImpl jdbcDAO = applicationContext.getBean("jdbcDAOImpl",JdbcDAOImpl.class);
        Circle circle = jdbcDAO.getCircle(1);
        System.out.println(circle.getName());
    }
}
