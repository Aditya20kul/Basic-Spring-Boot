package com.addykul.springdemo.Service;

import com.addykul.springdemo.error.EmployeeNotFoundException;
import com.addykul.springdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> empList = new ArrayList<Employee>();

    public Employee save(Employee emp){
        if(emp.getEmpId() == null){
            emp.setEmpId(UUID.randomUUID().toString());
        }
        empList.add(emp);
        return emp;
    }
    public List<Employee> getAllEmployees(){
        return empList;
    }

    public Employee getEmployeeById(String id){
        Employee res = null;
        for (Employee e: empList) {
            if(e.getEmpId().equals(id)){
                res = e;
                break;
            }
        }
        if(res == null){
            throw new EmployeeNotFoundException("Employee not found with id: "+id);
        }else{
            return res;
        }
    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee res = null;
        for (Employee e: empList) {
            if(e.getEmpId().equals(id)){
                res = e;
                break;
            }
        }
        if(res == null){
            throw new RuntimeException("Employee not found with id: "+id);
        }else{
            empList.remove(res);
            return "Employee deleted with id: "+id;
        }
    }
}
