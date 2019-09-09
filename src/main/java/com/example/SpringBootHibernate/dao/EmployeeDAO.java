package com.example.SpringBootHibernate.dao;

import com.example.SpringBootHibernate.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public java.util.List<Employee> getEmployeeList() {
        return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
    }
}