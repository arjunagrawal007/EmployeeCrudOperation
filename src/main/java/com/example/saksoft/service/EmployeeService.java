package com.example.saksoft.service;

import com.example.saksoft.model.Employee;
import com.example.saksoft.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}
