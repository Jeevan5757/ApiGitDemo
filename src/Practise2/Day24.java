package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a string
//		String name = "jeevan";
//		String reversename = "";
//		for(int i=name.length()-1;i>=0;i--) {
//			reversename += name.charAt(i);
//		}
//		System.out.println(reversename);
		
		//palindrom check
//		String name = "Ma da M";
//		name = name.toLowerCase().replace("\s", "");
////		System.out.println(name);
//		StringBuilder sb = new StringBuilder(name).reverse();
//		String reverseName = sb.toString();
//		
//		if(name.equalsIgnoreCase(reverseName)) {
//			System.out.println("palindrom");
//		}
//		else {
//			System.out.println("Not a Palindrome");
//		}
		
		//count vowels and consonant
//		String name = "Jeevan Jyoti Behera";
//		name = name.toLowerCase().replace("\s", "");
//		
//		String vowels = "aeiou";
//		int vowelscount = 0;
//		
//		for(int i=0;i<name.length();i++) {
//			for(int j=0;j<vowels.length();j++) {
//				if(name.charAt(i) == vowels.charAt(j)) {
//					vowelscount++;
//				}
//			}
//		}
//		int consonantscount = name.length()-vowelscount;
//		System.out.println(vowelscount);
//		System.out.println(consonantscount);
		
//		 String mainString = "hellohellohello";
//	     String subString = "hello";
//	     
//	     System.out.println(mainString.indexOf("e"));
//	     System.out.println(mainString.indexOf("h",5));
//	     int index =0;
//	     int count =0;
//	     while((index = mainString.indexOf(subString,index)) !=-1) {
//	    	 
//	    	 count++;
//	    	 index += subString.length();
//	     }
//	     
//	     System.out.println(count);
		
//		String str1 = "Hello";
//		String str2 = "he";
//		if(str1.toLowerCase().contains(str2.toLowerCase())) {
//			System.out.println("str1 contains all character of str2");
//		}
//		else {
//			System.out.println("str1 doesnot contains all character of str2");
//		}
	
//		String name = "Jeevanv";
//		ArrayList<Character> al = new ArrayList<>();
//		char[] ch = name.toCharArray();
//		for(char c: ch) {
//			al.add(c);
//		}
//		List<Character> distinctList = al.stream().distinct().collect(Collectors.toList());
//		String distinct = distinctList.stream().map(c->String.valueOf(c)).collect(Collectors.joining());
//	    System.out.println(distinct);
		
//		String name = "jeevan";
//		char[] ch = name.toCharArray();
//		Arrays.sort(ch);
////		String sorted = new String(ch);
//		//or
//		String sorted = Arrays.toString(ch); //print list of string
//		System.out.println(sorted);
//		String sb = new StringBuilder(new String(ch)).reverse().toString();
//		System.out.println("sorted in ascending order");
//		System.out.println(sorted.substring(1, sorted.length()-1).replace(",", "").replace(" ", ""));
//		System.out.println("sorted in decending order\n"+sb);
		
	}

}
