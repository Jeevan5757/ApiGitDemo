package Practise;

import java.util.stream.Collectors;

public class Day10_swap_two_string_using_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		
		str1 = str1+str2;
		System.out.println(str1);
		str2 = str1.substring(0, str1.length()-str2.length());
		System.out.println(str2);
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		
		
		//printing string without space
		String name = "Jeevan Jyoti Behera";
		String names = name.chars().filter(c->c!=' ').mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
				       
				       System.out.println(names);
	}

}
