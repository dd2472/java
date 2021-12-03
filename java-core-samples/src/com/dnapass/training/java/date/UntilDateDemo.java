package com.dnapass.training.java.date;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class UntilDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2021;
		int month = 0;
		int date =1;
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println();
		System.out.println("Year : " + cal.get(Calendar.YEAR));
		
		System.out.println("Month : " + cal.get(Calendar.MONTH));
		
		System.out.println("Date : " + cal.get(Calendar.DATE));
		
		System.out.println("Hour : " + cal.get(Calendar.HOUR));
		
		System.out.println("Minute : " + cal.get(Calendar.MINUTE));
		System.out.println();
		
		
		cal.clear();
		System.out.println();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.getTime());
		
		
		cal = Calendar.getInstance();
		System.out.println();
		System.out.println("\nCurrent Date and Time"+ cal.getTime());
		int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
		int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
		int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
		
		
		

	}

}
