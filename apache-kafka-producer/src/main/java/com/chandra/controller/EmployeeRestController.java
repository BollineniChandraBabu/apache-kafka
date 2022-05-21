package com.chandra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.model.Employee;
import com.chandra.service.EmployeeService;
import com.chandra.util.HttpStatusResponse;
import com.chandra.util.ResponseUtils;
import com.chandra.util.RestAPIConstants;

/**
 * This class is used to handle user requests
 * 
 * @author Chandra Babu Bollineni
 *
 */
@RestController()
@RequestMapping(RestAPIConstants.EMPLOYEE)
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * This method is used to Employee records in post request
	 * @param employees -employee's details
	 * @return
	 */
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<HttpStatusResponse> addCustomer(@RequestBody List<Employee> employees) {
		return ResponseUtils.prepareSuccessResponse(RestAPIConstants.DATA_INSERTION_SUCCESS_MESSAGE,
				employeeService.addEmployeeDetails(employees));
	}
}
