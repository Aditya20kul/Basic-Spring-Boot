package com.addykul.springdemo.Service;

import com.addykul.springdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String empId);
    String deleteEmployeeById(String empId);
}
