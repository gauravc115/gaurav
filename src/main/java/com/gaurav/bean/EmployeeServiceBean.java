package com.gaurav.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.gaurav.domain.Employee;
import com.gaurav.repository.EmployeeRepository;
import com.gaurav.service.EmployeeService;

public class EmployeeServiceBean implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployee(Integer id) {
		return employeeRepository.findById(id);
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
}
