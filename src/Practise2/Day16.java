package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
//		String data = "a2b3c4";
//		StringBuilder sb = new StringBuilder();
//		
//	    for(int i=0;i<data.length();i++) {
//	    	char ch = data.charAt(i);
//	    	
//	    	if(Character.isLetter(ch)) {
//	    		int count = Character.getNumericValue(data.charAt(i+1));
//	    		
//	    		for(int j=0;j<count;j++) {
//	    			sb.append(ch);
//	    		}
//	    	}
//	    }
//	    System.out.println(sb);
//	   // Write a Java Program to generate Output "a2b3c4" with the input "aabbbcccc"
//	    String data1 = "aabbbcccc";
//	    StringBuilder sb1 = new StringBuilder();
//	    int count = 1;
//	    for(int i=1;i<data1.length();i++) {
//	    	if(data1.charAt(i) == data1.charAt(i-1)) {
//	    		count++;
//	    	}
//	    	else {
//	    		sb1.append(data1.charAt(i-1)).append(count);
//	    		count=1;
//	    	}
//	    }
//	    sb1.append(data1.charAt(data.length()-1)).append(count);
//	    System.out.println(sb1);
//	    
//	    //product of an array
//	    int[] arr = {1,2,3,4};
//	    ArrayList<Integer> al = new ArrayList<>();
//	    for(int a:arr) {
//	    	al.add(a);
//	    }
//	    System.out.println(al);
//	    int product = (int) al.stream().reduce(1,(a,b)->a*b);
//	    System.out.println(product);
//	    //reverse a number
//	    int number = 3997;
//	    String num = Integer.toString(number);
//	    StringBuffer sb3 = new StringBuffer(num).reverse();
//	    int numb = Integer.parseInt(sb3.toString());
//	    System.out.println(numb);
//	    
//	    //second largest number in a given array
//	    int[] arr1 = {2,3,1,6,9,9};
//	    ArrayList<Integer> al1 = new ArrayList<>();
//	    for(int a:arr1) {
//	    	al1.add(a);
//	    }
//	    Integer al3 = al1.stream().distinct().sorted(Comparator.reverseOrder())
//	    		.skip(1).findFirst().orElse(null);
//	    System.out.println(al3);
	    
	    //First Non Repeating Character
	    String names = "GeeksForGeeks";
	    String s = names.toLowerCase();
	    LinkedHashMap<Character,Integer> hs = new LinkedHashMap<>();
	   
	    for(int i=0;i<s.length();i++) {
	    	char c = s.charAt(i);
	    	if(hs.containsKey(c)) {
	    		hs.put(c, hs.get(c)+1);
	    	}
	    	else {
	    		hs.put(c, 1);
	    	}
	    	
	    }
	    System.out.println(hs);
	    for(int i=0;i<s.length();i++) {
	    	char c = s.charAt(i);
	    	if(hs.get(c) == 1) {
	    		System.out.println("first non repeating character is: "+c);
	    		break;
	    	}
	    }
	    
	   
	    


	}

}
