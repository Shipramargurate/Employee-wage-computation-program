package com.bridgelabz.com;

import java.util.*;

public class EmployeeWage {
/*
 * Check Employee is Present or Absent
 * using random
 */
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		
		int randomNumber = random.nextInt(2); // will give 0 or 1 random number
		
		if (randomNumber == 1) // condition for present or absent
			System.out.println("EMPLOYEE IS PRESENT");
		else
			System.out.println("EMPLOYEE IS ABSENT");
	}
}
