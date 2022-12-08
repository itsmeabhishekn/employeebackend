package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

        System.out.println(e.getName());
        System.out.println(e.getCompanyName());
        System.out.println(e.getDesignation());
        System.out.println(e.getEmpcode());
        System.out.println(e.getMobileNo());
        System.out.println(e.getPassword());
        System.out.println(e.getUsername());
        System.out.println(e.getSalary());
        dao.save(e);
        return "{\"status\":\"success\"}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String edit()
    {
        return "this is the edit page ";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Employees> search(@RequestBody Employees s)
    {
        String empcode=String.valueOf(s.getEmpcode());
        System.out.println(empcode);
        return (List<Employees>) dao.search(s.getEmpcode());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employees> viewAll()
    {


        return (List<Employees>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public HashMap<String, String> delete(@RequestBody Employees d )
    {
        String empcode = String.valueOf(d.getEmpcode());
        System.out.println(empcode);
        dao.delete(d.getEmpcode());
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

}