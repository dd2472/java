package com.dnapass.training.java.Day8;
import java.io.InputStreamReader;


public class BufferedReader {

	public BufferedReader(InputStreamReader inputStreamReader) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name:");
		String str = reader.readline();
	    System.out.println(str+"Hello Hcl"+" ");
				

	}

	private String readline() {
		// TODO Auto-generated method stub
		return null;
	}

}
