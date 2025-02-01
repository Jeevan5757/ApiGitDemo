package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1  reverse a string
//		String name =  "RahulShettyAcademy";
//		StringBuilder sb = new StringBuilder(name).reverse();
//		System.out.println(sb);
		
		// 2  swap two string
//		String s1 = "Jeevan";
//		String s2 = "Behera";
//		String s3 = s1.concat(s2);
//		System.out.println(s3);
//		s2 = s3.substring(0, s3.length()-s2.length());
//		s1 = s3.substring(s2.length());
//		System.out.println(s2);
//		System.out.println(s1);
		
		//number of character in a string		
//		String name = "jeevan@123jyoti";
//		String alphabet = name.replaceAll("[^A-Za-z]", "");
//		System.out.println(alphabet.length());
		
		
		//cfind duplicate char from string
//		String name = "Jeevan";
//		String s = name.toLowerCase();
//		StringBuilder duplicate = new StringBuilder();
//		int[] count = new int[256];
//		
//		s.chars().forEach(x->{
//			count[x]++;
//		});
//		
//		s.chars().distinct().filter(c->count[c]>1).
//		forEach(c-> duplicate.append((char)c+" "));
//		
//		System.out.println(duplicate);
////		
		
		//reverse character of array
		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		//we cannot use directly to arraylist so we did below
		List<Character> ls = new ArrayList<>();
		for(char c:s) {
			ls.add(c);
		}
		System.out.println(ls);
		List<Character> rev = ls.reversed();
		System.out.println(rev);

	}

}
