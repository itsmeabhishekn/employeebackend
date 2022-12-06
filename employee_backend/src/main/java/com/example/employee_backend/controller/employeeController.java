package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String homepage()
    {
        return "this is the homepage ";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Employees e)
    {

        System.out.println(e.getName().toString());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getDesignation());
        System.out.println(e.getEmpcode());
        System.out.println(e.getMobile());
        System.out.println(e.getPassword());
        System.out.println(e.getUsername());
        System.out.println(e.getSalary());
        dao.save(e);
        return "this is the add page ";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String edit()
    {
        return "this is the edit page ";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String search()
    {
        return "this is the search page ";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employees> viewAll()
    {


        return (List<Employees>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("delete")
    public String delete()
    {
        return "this is the delete page ";
    }

}