package com.pedrohlimadev.aulaorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohlimadev.aulaorm.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
