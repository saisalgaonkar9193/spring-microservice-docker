package com.example.employee.repository;

import com.example.employee.dao.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String>{
    
}
