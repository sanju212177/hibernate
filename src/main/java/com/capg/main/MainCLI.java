package com.capg.main;

import com.capg.entity.Employee;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainCLI {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee();
/*
        //add row to table
        employee.setFirstName("vinay");
        employee.setLastName("bisht");
        employee.setEmail("vinay@email.com");
        employee.setLocation("tehri");
        session.save(employee);
*/
        //update row of table
        employee.setId(6);
        employee.setFirstName("rohit");
        employee.setLastName("rawat");
        employee.setEmail("rohit@email.com");
        employee.setLocation("lucknow");
        session.update(employee);

        /*//Delete row
        employee.setId(3);
        session.delete(employee);
        */
        transaction.commit();
    }

}
