package com.addykul.springdemo.controller;

import com.addykul.springdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public String home(){
        return "Hello from Spring-Boot";
    }

    @RequestMapping("/emp")
    public Employee emp(){
        return new Employee("Aditya", 23, 1200000);
    }

    @GetMapping("/new")
    public Employee newEmp(@RequestParam String name, @RequestParam int age, @RequestParam double salary){
        return new Employee(name, age, salary);
    }
}
