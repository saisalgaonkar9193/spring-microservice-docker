package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import com.example.employee.converter.EmployeeConverter;
import com.example.employee.dao.Employee;
import com.example.employee.dto.EmployeeDto;
import com.example.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private EmployeeConverter empConv;

    public List<Employee> listEntity() {
        return empRepo.findAll();
    }

    public Employee deleteEntity(String id) {
        Optional<Employee> emp = empRepo.findById(id);
        empRepo.deleteById(id);
        return emp.get();
    }

    public Employee updateEntity(EmployeeDto t) {
        return finalUpdate(t);
    }

    public Employee createEntity(EmployeeDto t) {
        return finalUpdate(t);
    }

    private Employee finalUpdate(EmployeeDto t) {
        Employee newEmp = empConv.convert(t);
        return empRepo.save(newEmp);
    }

}
