package com.example.employee.service;

import java.util.List;

import com.example.employee.dto.Employee;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    
    public List<Employee> list() {
        return List.of(new Employee("Sai"));
    }

}
