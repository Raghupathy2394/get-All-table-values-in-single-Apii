package com.example.Employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.entity.Employee;
import com.example.Employee.service.EmployeeServiceImp;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImp employeeService;
	
	@PostMapping("/create")
	public Employee create(@RequestBody Employee employee) {
		return employeeService.create(employee);
		
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getemp(@PathVariable ("id") Integer id){
		return employeeService.get(id);
	}
	
	@PutMapping("/put")
	public Employee update(@RequestBody Employee employee ) {
		return employeeService.update(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return employeeService.delete(id);
	}
}
