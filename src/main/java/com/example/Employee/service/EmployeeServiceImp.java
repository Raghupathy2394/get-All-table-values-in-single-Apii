package com.example.Employee.service;

import java.util.Optional;

import com.example.Employee.entity.Employee;

public interface EmployeeServiceImp {

	public Employee create(Employee employee);

	public Optional<Employee> get(Integer id);

	public Employee update(Employee employee);

	public String delete(Integer id);
}
