package com.gaurav.service;

import com.gaurav.domain.Employee;

public interface EmployeeService {

	Employee getEmployee(Integer id);
	
	void save(Employee employee);
}
