package com.example.SpringBootHibernate.controller;

import com.example.SpringBootHibernate.dao.EmployeeDAO;
import com.example.SpringBootHibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Java Developer Zone on 19-07-2017.
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;
    @RequestMapping("/getEmployeeList")
    public java.util.List<Employee> getEmployeeList() {
        return employeeDAO.getEmployeeList();
    }
}
