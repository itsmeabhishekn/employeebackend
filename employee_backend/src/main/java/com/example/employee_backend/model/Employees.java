package com.example.employee_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue
    private int empcode;

    private String name;

    private String designation;

    private int salary;

    private String companyName;

    private String mobileNo;

    private String username;

    private String password;

    public Employees() {
    }

    public Employees(int code, String name, String designation, int salary, String companyName, String username, String password, String mobileNo) {
        this.empcode = code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyName = companyName;
        this.mobileNo = mobileNo;
        this.username = username;
        this.password = password;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
