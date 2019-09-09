package com.example.SpringBootHibernate.model;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @Column
    private String employeeName;
    @Column
    private String employeeRole;
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeRole() {
        return employeeRole;
    }
    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
