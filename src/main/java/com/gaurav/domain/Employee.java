package com.gaurav.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name = "Employee")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "Contact_Number")
	private Integer contactno;
	
	@Column(name = "Salary")
	private Integer salary;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Role")
	private String role;
	
	@Column(name = "Location")
	private String location;
	
	public Integer getId() {
		return id;
	}
	public Integer getContactno() {
		return contactno;
	}
	public Integer getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public String getLocation() {
		return location;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setContactno(Integer contactno) {
		this.contactno = contactno;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
}
