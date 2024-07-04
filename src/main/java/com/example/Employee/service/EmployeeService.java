package com.example.Employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceImp {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> get(Integer id) {
		return employeeRepository.findById(id);
	}

	@Override
	public Employee update(Employee employee) {
		Optional<Employee> employee2 = employeeRepository.findById(employee.getId());
		Employee employee3 = employee2.get();
		employee3.setName(employee.getName());
		employee3.setJob(employee.getJob());
		return employeeRepository.save(employee3);
	}

	@Override
	public String delete(Integer id) {
		employeeRepository.deleteById(id);
		return "Deleted";
	}
	
}
