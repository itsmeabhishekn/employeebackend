package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

    @GetMapping("/")
    public String homepage()
    {
        return "this is the homepage ";
    }

    @PostMapping("/add")
    public String add()
    {
        return "this is the add page ";
    }

    @PostMapping("/edit")
    public String edit()
    {
        return "this is the edit page ";
    }

    @PostMapping("/search")
    public String search()
    {
        return "this is the search page ";
    }

    @GetMapping("viewall")
    public String viewAll()
    {
        return "this is the viewall page";
    }

    @PostMapping("delete")
    public String delete()
    {
        return "this is the delete page ";
    }

}