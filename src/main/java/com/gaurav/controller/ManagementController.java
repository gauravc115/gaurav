package com.gaurav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.domain.Employee;
import com.gaurav.service.EmployeeService;
import com.google.gson.Gson;

@RestController
@RequestMapping("employees")
public class ManagementController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="{employee_id}", method=RequestMethod.GET)
	public String getEmployee(@PathVariable("employee_id")int eid) {
		Employee employee = employeeService.getEmployee(eid);
		return employee.getName();
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	@ResponseBody
	public String saveEmployee(HttpEntity<String> data) {
		Gson gson = new Gson();
		try {
			String json = data.getBody();
			Employee employee = gson.fromJson(json, Employee.class);
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getRole());
			System.out.println(employee.getContactno());
			System.out.println(employee.getLocation());
			System.out.println(employee.getSalary());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "gaurav";
	}
}
