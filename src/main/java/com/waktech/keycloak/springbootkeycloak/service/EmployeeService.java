package com.waktech.keycloak.springbootkeycloak.service;

import com.waktech.keycloak.springbootkeycloak.entity.Employee;
import com.waktech.keycloak.springbootkeycloak.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @PostConstruct
    public void initializeEmployeeTable(){
        employeeRepository.saveAll(
            Stream.of(new Employee("wak", 10000),
                    new Employee("uak", 20000),
                    new Employee("fak", 30000)).collect(Collectors.toList()));

        }

    public Employee getEmployee(int employeeId) {
        return employeeRepository
                .findById(employeeId)
                .orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository
                .findAll();
    }

}
