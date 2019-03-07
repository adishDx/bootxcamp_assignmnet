package com.ttn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * This is the main application foe the gradle tutorial application.
 */
public class Application {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		Arrays.asList(1, 2, 3, 4, 5, 6).forEach(value -> {
			employeeList.add(
					new Employee(value, "Sample " + value, "", "", 25 + value, new Date())
			);
		});
		employeeList.forEach(employee -> {
			System.out.println(employee.toString());
		});
	}
}
