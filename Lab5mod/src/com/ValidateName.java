package com;

import java.util.Scanner;

class NameException extends Exception {
	public NameException(String msg) {
		System.out.println(msg);
	}
}
public class ValidateName {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First name:");
		String first=s.nextLine();
		System.out.println("Enter Last name:");
		String last=s.nextLine();
		s.close();
		try {
			if (first.isEmpty()) {
				if (last.isEmpty()) {
					throw new NameException("Name can not be empty");
				}
				else {
					System.out.println("Name of the employee is:"+ last);
				}
			}
			else {
				System.out.println("Name of the employee is:"+first+" "+last);
			}
		}
		catch (NameException e) {
			System.out.println(e);
		}
	}
}

