package com.chandra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class serving as model to hold data
 * @author Chandra Babu Bollineni
 *
 */
@Data
@NoArgsConstructor
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
