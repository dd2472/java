package com.dnapass.training.java.day1;

public class Operation {

	public static void main(String[] args) {
		int num1 = 6, num2 = 8, num3=5,n4 = 55, n5=9,n6=20,n7=5, n8=-3,n9 = 15,n10 = 2,n11=3,output1,output2,output3,output4;
		output1 = (num2+num3)*num1;
		output2 = (n4 + n5)%n5;
		output3 = n6+((n8*n7)/num2);
		output4 = (n7+n9/n11)*((n10-num2)%n11);
		
		System.out.println("Operational output   :" +output1);
		System.out.println("Operational output2  :" +output2);
		System.out.println("Operational output3  :" +output3);
		System.out.println("Operational output4  :" +output4);
	}

}
