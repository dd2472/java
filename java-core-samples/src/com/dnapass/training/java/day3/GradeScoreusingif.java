package com.dnapass.training.java.day3;

public class GradeScoreusingif {

	public static void main(String[] args) {
		int score = 76;
		char grade;
		if(score >90)
		{ grade = 'A';}
		
		else if (score >=80)
		{grade ='B';}
		
		else if (score > 70)
		{grade = 'C';}
		
		else
		{grade = 'E';}

		System.out.println("Grade obtained is :"+ grade);
	}

}
