package Practise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Calendar;
import java.time.LocalDate;

public class Day4_Date_Time {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub

		//using calendar class
	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	cal.set(Calendar.YEAR, 2024);
	cal.set(Calendar.MONTH, 10);
	cal.set(Calendar.DAY_OF_MONTH, 7);
	
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	System.out.println(dayOfWeek);
	String[] day = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
	System.out.println(day[dayOfWeek-1]);
		
		//using LocalDate class
//		LocalDate date = LocalDate.of(2024, 11, 7); //year month date
//		System.out.println(date.getDayOfWeek());
//		System.out.println(date.getDayOfMonth());
//		System.out.println(date.getDayOfYear());


	}

}
