package com.dnapass.straining.java;

class Casio{
	int i;
	int j;
	String operation;
	
	public Casio()
	{
		i=0;
		j=0;
		operation ="Nothing";
		System.out.println();
	}
	
	public Casio(int a)
	{
		a =5;
		j=0;
		operation ="Nothing";
		System.out.println(a);
		
	}
}

public class ConstrocterOverloading {
	public static void main(String[] args)
	{
	
	Casio obj =new Casio(5);
	
}
}