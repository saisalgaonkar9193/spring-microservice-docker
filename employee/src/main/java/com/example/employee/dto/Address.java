package com.example.employee.dto;

import lombok.Data;

@Data
public class Address {
    private String addressLine1,addressLine2,addressLine3,pinCode;
    private State state;
    
}
