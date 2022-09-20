package com.bridgelabz.com;

import java.util.*;

public class EmployeeWage {
	/*
	 * Add Part time Employee & Wage by assuming part time hours is 8
	 */
	public static void main(String[] args) {

		int fullDayHours = 8;
		int wagePerHours = 20;
		int halfdayHours = 4;
		int salary = 0;

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();

		int randomNumber = random.nextInt(3); // will give 0 or 1 random number

		if (randomNumber == 1) { // condition for present or absent
			System.out.println("EMPLOYEE IS PRESENT");
			salary = fullDayHours * wagePerHours; // if employee is present than his salary will be

		} else if (randomNumber == 2) // condition for half day

		{
			salary = wagePerHours * halfdayHours;
		}

		else
			System.out.println("EMPLOYEE IS ABSENT");
		System.out.println("Total salary of employee is : " + salary);

	}
}
