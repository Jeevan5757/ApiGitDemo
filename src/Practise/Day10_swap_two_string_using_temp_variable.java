package Practise;

public class Day10_swap_two_string_using_temp_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		
		String temp;
		temp = str1;
		str1 = str2;
		str2 = temp;
		
		str2 = temp;
		System.out.println(str2);
		System.out.println(str1);

	}

}
