package com.dnapass.training.java.day1;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,f=0;
		
		System.out.println("Enter a number : ");
		a=sc.nextInt();
		for(int i=2;i<=a/2;i++)
		{
			f=1;
			break;
		}

		{
	
	if(f==0)
	System.out.println("prime Number");
	else 
	  System.out.println("Not a prime Number");
		}
	}
}
