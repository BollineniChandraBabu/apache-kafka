package com.chandra.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.chandra.model.Employee;
import com.chandra.service.EmployeeService;
import com.chandra.util.BusinessConstants;
import com.chandra.util.KafkaConstants;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    Logger logger= LogManager.getLogger(EmployeeServiceImpl.class);

    /**
     * This method is used to publish customer records as messages to kafka topic
     *
     * @param employees -employee's details
     * @return String
     */
    public String addEmployeeDetails(List<Employee> employees) {

        if (!CollectionUtils.isEmpty(employees)) {
            for (Employee employee : employees) {
                kafkaTemplate.send(KafkaConstants.TOPIC, employee);
                logger.info(BusinessConstants.KAFKA_TOPIC_PUBLISH_SUCCESS+employee);
            }
        }
        return BusinessConstants.EMPLOYEE_RECORD_ADDED_SUCCESS;
    }
}
