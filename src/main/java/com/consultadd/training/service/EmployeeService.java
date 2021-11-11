package com.consultadd.training.service;

import com.consultadd.training.model.Employee;
import com.consultadd.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public String saveEmployee(Employee employee) {
        if(employeeRepository.existsById(employee.getId())) {
            return "Can't Save Data. Id already exists.";
        }
        else {
            employeeRepository.save(employee);
            return "employee data saved successfully.";
        }
    }

    public String updateEmployee(Employee employee) {
        if(employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee);
            return "employee data updated successfully.";
        }
        else {
            return "Can't update Data. Id doesn't exists.";
        }
    }

    public String deleteEmployee(String id) {
        employeeRepository.deleteById(id);
        return "employee record deleted successfully";
    }

}
