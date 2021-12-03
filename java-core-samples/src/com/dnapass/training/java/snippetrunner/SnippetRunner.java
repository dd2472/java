package com.dnapass.training.java.snippetrunner;
import java.util.HashSet;
import java.util.Set;
public class SnippetRunner {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		// TODO Auto-generated method stub
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("pink");
		colors.add("Yellow");
		
		String[] new_array = new String[colors.size()];
		colors.toArray(new_array);
		
		System.out.println("Array elements : ");
		for(String element : new_array) {
			System.out.println(element);
		}
	}

}
