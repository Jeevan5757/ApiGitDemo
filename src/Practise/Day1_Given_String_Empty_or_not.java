package Practise;

import java.util.function.Predicate;

//@FunctionalInterface
//interface lambda{
//	public void isempty(String s);
//}

public class Day1_Given_String_Empty_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main.java
		Predicate isEmptyString = str -> ((String) str).isEmpty();

		// Test cases
		String str1 = ""; // empty string
		String str2 = "Java lambda expression!"; // non-empty string

		// Check if the strings are empty using the lambda expression
		System.out.println("String 1:" + str1);
		System.out.println("String 1 is empty: " + isEmptyString.test(str1));
		System.out.println("\nString 2:" + str2);
		System.out.println("String 2 is empty: " + isEmptyString.test(str2));
	}
}
