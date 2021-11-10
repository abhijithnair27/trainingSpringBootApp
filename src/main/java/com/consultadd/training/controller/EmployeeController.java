package com.consultadd.training.controller;

import com.consultadd.training.model.Employee;
import com.consultadd.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;

    }
}
