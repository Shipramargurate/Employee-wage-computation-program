package com.bridgelabz.com;

import java.util.*;

public class EmployeeWage {
	/*
	 * solving using switch case
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();

		int fullDayHours = 8;
		int wagePerHours = 20;
		int halfdayHours = 4;
		int salary = 0;

		int randomNumber = random.nextInt(3); // will give 0 ,1 and 2 random number

		switch (randomNumber) {
		case 0:
			System.out.println("EMPLOYEE IS ABSENT"); // random number will be o then employee is absent
			break;
		case 1:
			salary = fullDayHours * wagePerHours; // if employee is present than his salary will be
			break;
		case 2:
			salary = wagePerHours * halfdayHours; // condition for half day

		}
		System.out.println("Total salary of employee is : " + salary);

	}
}
