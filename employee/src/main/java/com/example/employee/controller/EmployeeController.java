package com.example.employee.controller;

import java.util.List;

import com.example.employee.dao.Employee;
import com.example.employee.dto.EmployeeDto;
import com.example.employee.service.EmployeeService;
import com.example.employee.structure.CrudController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements CrudController<EmployeeDto, Employee> {

    @Autowired
    private EmployeeService empSer;

    @Override
    public ResponseEntity<List<Employee>> listEntity() {
        return ResponseEntity.ok(empSer.listEntity());
    }

    @Override
    public ResponseEntity<Employee> updateEntity(EmployeeDto oldRes){        
        return ResponseEntity.ok(empSer.updateEntity(oldRes));
    }

    @Override
    public ResponseEntity<Employee> createEntity(EmployeeDto newRes) {
        return ResponseEntity.ok(empSer.createEntity(newRes));
    }

    @Override
    public ResponseEntity<Employee> deleteEntity(String id){
        return ResponseEntity.ok(empSer.deleteEntity(id));        
    }

}
