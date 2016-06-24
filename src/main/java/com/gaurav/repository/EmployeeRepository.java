/**
 * 
 */
package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.domain.Employee;

/**
 * @author gaurav
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Employee findById(Integer id);
		
}
