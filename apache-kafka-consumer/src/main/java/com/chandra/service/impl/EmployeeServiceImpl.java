package com.chandra.service.impl;

import static com.chandra.util.BusinessConstants.KAFKA_TOPIC_RECEIVED_MSG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.chandra.model.Employee;
import com.chandra.util.KafkaConstants;

@Service
public class EmployeeServiceImpl {
    Logger logger= LogManager.getLogger(EmployeeServiceImpl.class);

    @KafkaListener(topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID)
    public Employee listener(Employee employee) {
        logger.info(KAFKA_TOPIC_RECEIVED_MSG + employee);
        return employee;
    }
}
