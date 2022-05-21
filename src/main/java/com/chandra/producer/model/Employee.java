package com.chandra.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class serving as model to hold data
 * @author Chandra Babu Bollineni
 *
 */
@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
public class Employee {

	private Integer id;
	private String name;
	private String email;

	@Override
	public String toString() {
		return "Employee [Id=" + id + ", Name=" + name + ", Email="
				+ email + "]";
	}

}
