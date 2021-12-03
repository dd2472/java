package com.dnapass.straining.java;


class casio
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(int i,int j,double l)
	{
		System.out.println(i+j);
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		casio obj = new casio();
		
			obj.add(5,10);
			obj.add(5,6,7);
			obj.add(5, 8, 8.6);
		
	}

}
