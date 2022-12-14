package com.pedrohlimadev.aulaorm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedrohlimadev.aulaorm.entities.Departament;
import com.pedrohlimadev.aulaorm.entities.Employee;
import com.pedrohlimadev.aulaorm.repositories.EmployeeRepository;

@SpringBootApplication
public class AulaormApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AulaormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> result = repository.findAll();

		for(Employee emp : result) {
			System.out.println(emp);
		}
	}

}
