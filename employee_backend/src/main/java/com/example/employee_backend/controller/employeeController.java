package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class employeeController {

    @GetMapping("/")
    public String homepage()
    {
        return "this is the homepage ";
    }

    @GetMapping("/add")
    public String add()
    {
        return "this is the add page ";
    }

    @GetMapping("/search")
    public String search()
    {
        return "this is the search page ";
    }

    @GetMapping("viewall")
    public String viewAll()
    {
        return "this is the viewall page";
    }

    @GetMapping("delete")
    public String delete()
    {
        return "this is the delete page ";
    }

}