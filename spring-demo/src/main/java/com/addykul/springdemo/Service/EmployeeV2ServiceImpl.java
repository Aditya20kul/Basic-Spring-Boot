package com.addykul.springdemo.Service;

import com.addykul.springdemo.entity.EmployeeEntity;
import com.addykul.springdemo.model.Employee;
import com.addykul.springdemo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        if(employee.getEmpId() == null){
            employee.setEmpId(UUID.randomUUID().toString());
        }
        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, entity);
        employeeRepository.save(entity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String empId) {
        return null;
    }

    @Override
    public String deleteEmployeeById(String empId) {
        return null;
    }
}
