package com.example.employee.converter;

import com.example.employee.dao.Employee;
import com.example.employee.dto.EmployeeDto;
import com.example.employee.structure.EntityConverter;

import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter implements EntityConverter<EmployeeDto,Employee>{

    @Override
    public EmployeeDto convert(Employee u) {
        return EmployeeDto.builder()
        .id(u.getId())
        .name(u.getName())
        .build();
    }

    @Override
    public Employee convert(EmployeeDto t) {        
        return Employee.builder()
        .id(t.getId())
        .name(t.getName())
        .build();
    }
    
}
