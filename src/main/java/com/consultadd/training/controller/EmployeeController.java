package com.consultadd.training.controller;

import com.consultadd.training.model.Employee;
import com.consultadd.training.repository.EmployeeRepository;
import com.consultadd.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String heelo() {
        return "Welcome User!";
    }
    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        List<Employee> employeeList = employeeService.getEmployees();
        return employeeList;
    }

    @PostMapping("/addemp")
    public String saveEmployees(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/updateEmp")
    public String updateEmployees(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmp/{empId}")
    public String deleteEmployees(@PathVariable("empId") String empId) {
        return employeeService.deleteEmployee(empId);
    }
    //test comment
}
