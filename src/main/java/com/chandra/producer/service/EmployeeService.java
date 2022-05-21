package com.chandra.producer.service;

import com.chandra.producer.model.Employee;
import com.chandra.producer.util.KafkaConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static com.chandra.producer.util.BusinessConstants.EMPLOYEE_RECORD_ADDED_SUCCESS;
import static com.chandra.producer.util.BusinessConstants.KAFKA_TOPIC_PUBLISH_SUCCESS;

/**
 * This class is used to perform business operation
 * 
 * @author Chandra Babu Bollineni
 *
 */

public interface EmployeeService {
	String addEmployeeDetails(List<Employee> employees);

}
