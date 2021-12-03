package com.dnapass.training.java.day2;

public class MaximumMinimum {

	public static void main(String[] args) {
		int n1 = 20 , n2 = 45,n3 = 50, n4=25 , n5=30 ,maximum,minimum,Maximum,Minimum;
		
		//maximum of 2 numbers
		maximum = Math.max(n1,n2);
		System.out.println("Maximum number of two:"+" "+ maximum);
		
		
		//Minimum of 2 numbers
		minimum = Math.min(n1,n2);
		System.out.println("Minimum number of two:"+" "+minimum);
		
		
		//maxium of three numbers
		Maximum = Math.max(Math.max(n3,n4),n5);
		System.out.println("Maximum number of three:"+" "+ Maximum);
		
		//minimum of three numbers

				Minimum = Math.min(Math.min(n3,n4),n5);
				System.out.println("Minimum number of three:"+" "+Minimum);
				
	}

}
