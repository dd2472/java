package com.dnapass.training.java.day1;
import java.util.Scanner;
public class Inputs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first numbrer: ");
		int num1 = in.nextInt();
		
		System.out.print("Input Second numbrer: ");
		int num2 = in.nextInt();
		
		System.out.print("Input Third numbrer: ");
		int num3 = in.nextInt();
		

		System.out.println("Average :"+ (num1 + num2 + num3 )/3);
		
	}

}
