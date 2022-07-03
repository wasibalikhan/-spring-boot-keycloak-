package com.waktech.keycloak.springbootkeycloak.repository;

import com.waktech.keycloak.springbootkeycloak.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
}
