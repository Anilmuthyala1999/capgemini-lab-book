package com.cg.eis;

import java.util.Scanner;

class EmployeeeException extends Exception {
	public EmployeeeException(String msg) {
		System.out.println(msg);
	}
}
public class SalaryException {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary:");
		int sal=s.nextInt();
		s.close();
		try {
			if (sal<3000) {
				throw new EmployeeeException("Salary less than 3000");
			}
			else {
				System.out.println("Salary of employee is "+sal);
			}
		}
		catch (EmployeeeException e) {
				System.out.println(e);
		}
	}
}
