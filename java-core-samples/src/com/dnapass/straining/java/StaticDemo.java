package com.dnapass.straining.java;


class Employ

{
	int empid;
	int salary;
	static String ceo;
	
	
	static                //Static Block
	{
		ceo =" PRUDHVI ";
	}
	
	
	
	public void display()     // method
	{
		System.out.println(empid +":"+ salary+" "+ ceo );
	}
}



public class StaticDemo {

	public static void main(String[] args) {
		
		Employ Naveen = new Employ();
		Naveen.empid= 26;
		Naveen.salary=15000;
		//Employ.ceo="Mahesh";          //As the variable is static we can give class name instead of object name .
		
		Employ Rahul = new Employ();
		Rahul.empid = 29;
		Rahul.salary = 18000;
		//Employ.ceo="Raj";             // to access static variables we don't need object.
		
		Naveen.display();
		Rahul.display();

	}

}
