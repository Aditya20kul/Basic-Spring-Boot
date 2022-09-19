package com.addykul.springdemo.controller;
import com.addykul.springdemo.Service.EmployeeService;
import com.addykul.springdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v2/employee")
public class EmployeeV2Controller {
    @Qualifier("employeeV2ServiceImpl")
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}
