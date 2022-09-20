package com.bridgelabz.com;

import java.util.*;

public class EmployeeWage {
	/*
	 * Calculate Wages till a condition of total working hours or days is reached
	 * for a month assuming 100 hours and 20day
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
		int day = 0;
		int monthlyHours = 0;

		while (day != 20 && monthlyHours != 100)// condition till working hours reaches for month
		{
			day++;

			int randomNumber = random.nextInt(3); // will give 0 ,1 and 2 random number

			switch (randomNumber) {
			case 0:
				System.out.println("EMPLOYEE IS ABSENT"); // random number will be o then employee is absent
				break;
			case 1:
				salary = fullDayHours * wagePerHours; // if employee is present than his salary will be
				monthlyHours = monthlyHours + fullDayHours;
				break;
			case 2:
				salary = wagePerHours * halfdayHours; // condition for half day
				monthlyHours = monthlyHours + halfdayHours;
			}
			monthlySalary = monthlySalary + salary;
			System.out.println("Day " + day + " employee salaray is : " + salary);

		}

		System.out.println("Monthly Salary: " + monthlySalary);
	}
}
