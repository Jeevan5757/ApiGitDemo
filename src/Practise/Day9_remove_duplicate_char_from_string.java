package Practise;

import java.util.Scanner;

public class Day9_remove_duplicate_char_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.nextLine().toLowerCase();
		
		StringBuilder result = new StringBuilder();
		boolean [] isPresent =new boolean[256];
		input.chars().forEach(c->{
			if(!isPresent[c]) {
				result.append((char)c);
				isPresent[c]=true;
			}
		});
		System.out.println(result);
//		String data = "hackerearth";
//		data.chars().forEach(System.out::println);
//		

	}

}
