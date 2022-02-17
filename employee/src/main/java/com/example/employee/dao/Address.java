package com.example.employee.dao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String addressLine1,addressLine2,addressLine3,pinCode;
    private State state;
    
}
