package org.amunawar.springdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;

@Component
public class HibernateDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int getCircleCount(){
        String sql = "Select count(*) from Circle";
        Query query = getSessionFactory().openSession().createQuery(sql);
        return  ((Long) query.getSingleResult()).intValue();
    }
}
