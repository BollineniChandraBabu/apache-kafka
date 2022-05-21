package com.chandra.producer.service.impl;

import com.chandra.producer.model.Employee;
import com.chandra.producer.service.EmployeeService;
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
                logger.info(KAFKA_TOPIC_PUBLISH_SUCCESS);
            }
        }
        return EMPLOYEE_RECORD_ADDED_SUCCESS;
    }
}
