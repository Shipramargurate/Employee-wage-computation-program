package com.bridgelabz.com;

import java.util.*;

public class EmployeeWage {
	/*
	 * Calculate Daily Employee Wage assuming wage per hour is 20 and full day hour
	 * is 8
	 */
	public static void main(String[] args) {

		int fullDayHours = 8;
		int wagePerHours = 20;
		int salary = 0;

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();

		int randomNumber = random.nextInt(2); // will give 0 or 1 random number

		if (randomNumber == 1) { // condition for present or absent
			System.out.println("EMPLOYEE IS PRESENT");
			salary = fullDayHours * wagePerHours; // if employee is present than his salary will be
		} else
			System.out.println("EMPLOYEE IS ABSENT");
		System.out.println("Total salary of employee is : " + salary);

	}
}
