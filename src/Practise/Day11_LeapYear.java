package Practise;

import java.util.Scanner;

class LeapYear{
	public static boolean isLeapYear(int year) {
		if(year%4 ==0) {
			if(year%100==0) {
				if(year%400==0) {
					return true;
				}
				else {
					return false;
				}
				
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
}

public class Day11_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a year: ");
		int year = sc.nextInt();
		boolean isLeap = LeapYear.isLeapYear(year);
		if(isLeap) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
