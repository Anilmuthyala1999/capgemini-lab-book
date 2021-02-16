package com;


import java.util.Scanner;

class AgeException extends Exception {
	public AgeException(String msg) {
		System.out.println( msg);
	}
}
public class ValidateAge {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s.nextInt();
		s.close();
		try {
			if (age<16) 
				throw new  AgeException("Age not greater than 15, Invalid Age");
			else
				System.out.println("Age is Valid");
		}
		catch (AgeException e) {
			System.out.println(e);
		}
	}
}
