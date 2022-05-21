package com.chandra.service;


import com.chandra.model.Employee;

/**
 * This class is used to perform business operation
 * 
 * @author Chandra Babu Bollineni
 *
 */
public interface EmployeeService {
	/**
	 * This method is used to consumer messages from kafka topic
	 *
	 * @param employee {@link Employee}
	 * @return {@link Employee}
	 */
	Employee listener(Employee employee);
}
