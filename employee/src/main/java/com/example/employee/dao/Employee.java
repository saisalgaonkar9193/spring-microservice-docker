package com.example.employee.dao;

import com.example.employee.structure.DAO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document("employee")
public class Employee implements DAO{
    @Id
    private String id;
    private String name;
    private Address adress;

}
