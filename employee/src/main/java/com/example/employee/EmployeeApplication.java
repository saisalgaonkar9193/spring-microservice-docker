package com.example.employee;

import java.util.List;

import com.example.employee.dto.Employee;
import com.example.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeApplication {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@GetMapping("/employee/list")
	public ResponseEntity<List<Employee>> listEmployee() {
		return ResponseEntity.ok(employeeService.list());

	}

	@GetMapping(value = "/greet")
	public String getMethodName() {
		return "Hello";
	}

}
