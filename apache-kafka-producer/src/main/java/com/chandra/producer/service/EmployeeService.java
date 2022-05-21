package com.chandra.producer.service;


import java.util.List;

import com.chandra.producer.model.Employee;

/**
 * This class is used to perform business operation
 * 
 * @author Chandra Babu Bollineni
 *
 */

public interface EmployeeService {
	String addEmployeeDetails(List<Employee> employees);

}
