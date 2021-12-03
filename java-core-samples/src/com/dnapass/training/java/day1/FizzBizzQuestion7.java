package com.dnapass.training.java.day1;
import java.util.Scanner;

public class FizzBizzQuestion7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value ");
		int a = sc.nextInt();

	
		if(a%3==0 && a%5==0)
		
		{
			System.out.println("Fizz Buzz ");
			}
		
		else if(a%3==0)
		{
			System.out.println("Fizz");
			}
		else if(a%5==0)
		{
			System.out.println("Buzz");
		}
		
		else
		{
			System.out.println(a);
		}
		
	}

}
