package com.bridgelabz.com;

import java.util.*;

public class EmployeeWage {
	/*
	 * Calculating Wages for a Month by assuming 20 working day per month
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();

		int fullDayHours = 8;
		int wagePerHours = 20;
		int halfdayHours = 4;
		int monthlySalary = 0;
		int workingDaysPerMonth = 20;
		int salary = 0;

		for(int i = 0; i < workingDaysPerMonth; i++) // condition for monthly salary
		{
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
		System.out.println("Monthly Salary: " + monthlySalary);
	}
}
