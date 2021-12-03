package com.dnapass.training.java.day1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	float a,b,c;
	double d;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number :");
	 a = sc.nextInt();
	
	System.out.print("Enter first number :");
	 b = sc.nextInt();
	
	System.out.print("Enter first number :");
	 c = sc.nextInt();
	 
	 d=(a+b+c)/3;
	 System.out.println("The Average :"+ d);
	

	}

}
