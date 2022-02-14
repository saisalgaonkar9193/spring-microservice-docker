package com.example.employee.dto;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private Address adress;

    public Employee(String name) {
        this.name = name;
    }

    

}
