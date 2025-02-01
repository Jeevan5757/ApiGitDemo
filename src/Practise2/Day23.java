package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Day23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input = "Alice is girl and Bob is boy";
//		Map<String,Integer> hashmap = new HashMap<String,Integer>();
//		String[] words = input.split(" ");
//		for(String word: words) {
//			if(hashmap.containsKey(word)) {
//				hashmap.put(word, hashmap.get(word)+1);
//			}
//			else {
//				hashmap.put(word, 1);
//			}
//		}
//		System.out.println(hashmap);
		
		//reverse entire sentence
//		String input = "India is country My";
//		ArrayList<String> word = new ArrayList<>();
//		String output ="";
//		String[] words = input.split(" ");
//		for(int i=words.length;i>0;i--) {
//			word.add(words[i-1]);
//			output = output + words[i-1] +" ";
//		}
//		System.out.println(word);
//		String output = String.join(" ", word);
//		System.out.println("input is: "+input);
//		System.out.println("output is: "+output.trim());
		
//		String input = "This is an example";
//		String[] array = input.split(" ");
//		String charac = String.join("", array);
//		System.out.println(charac);
//		Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
//		for(int i=0;i<charac.length();i++) {
//			if(hashmap.containsKey(charac.charAt(i))) {
//				hashmap.put(charac.charAt(i), hashmap.get(charac.charAt(i))+1);
//			}
//			else {
//				hashmap.put(charac.charAt(i),1);
//			}
//		}
//		System.out.println(hashmap);
		
		//removing duplicate from an array
//		String[] strArray = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};
//		ArrayList<String> strArraylist = new ArrayList<String>(Arrays.asList(strArray));
//		
//		ArrayList<String> uniquelist = new ArrayList<String>();
//		strArraylist.stream().distinct().forEach(x->uniquelist.add(x));
//		System.out.println(uniquelist);
//		
//		//using hashset find duplicate element
//		ArrayList<String> duplicateElement = new ArrayList<>();
//		HashSet<String> hs = new HashSet<>();
//		for(String arrayElement: strArray) {
//			if(!hs.add(arrayElement)){
//				duplicateElement.add(arrayElement);
//			}
//			
//		}
//		System.out.println("duplicate string are: "+duplicateElement);
//		System.out.println("unique string are: "+hs);
		
//		String Input = "reverse each word in a string";
//		
//		String[] words = Input.split(" ");
//		ArrayList<String> reversedword = new ArrayList<>();
//		for(String word: words) {
//			StringBuilder sb = new StringBuilder(word);
//			reversedword.add(sb.reverse().toString());
//		}
//		System.out.println(String.join(" ",reversedword ));
		
		//anargram or not
//		String str1 = "Army";
//		String str2 = "Mary";
//		str1 = str1.toLowerCase();
//		str2 = str2.toLowerCase();
//		
//		char[] ch1 = str1.toCharArray();
//		char[] ch2 = str2.toCharArray();
//		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		String sortedstring1 = new String(ch1);
//		String sortedstring2 = new String(ch2);
//		
//		if(sortedstring1.equalsIgnoreCase(sortedstring2)) {
//			System.out.println("2 string are anagram to each other");
//		}
//		else {
//			System.out.println("2 string are not anagram");
//		}
		
		//reverse int
//		int a = 73514;
//		String str = Integer.toString(a);
//		char[] ch = str.toCharArray();
//		Arrays.sort(ch);
//		String sortedstr = new String(ch);
//		int sortedint = Integer.parseInt(sortedstr);
//		System.out.println(sortedint);
//		
		
		//print duplicate char from string
//		String Input = "apple is fruit";
//		char[] ch = Input.toCharArray();
//		System.out.println("Duplicate char are: ");
//		for(int i=0;i<ch.length;i++) {
//			for(int j=i+1;j<ch.length;j++) {
//				if(ch[i] == ch[j]) {
//					System.out.print(ch[j]+"");
//				}
//			}
//		}
		
		//. Find and print the largest element in an array.
//		int[] arr = new int[] { 25, 11, 7, 75, 56 };
//		//Arrays.asList() can not conver primitive datatype like int[] char[] double[]
//		Integer[] integerarray = Arrays.stream(arr)  //Convert int[] to Stream<Integer>
//				                   .boxed()   //Convert each int to Integer
//				                   .toArray(Integer[]::new);
//		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerarray));
//		Integer maxdigit = Collections.max(al);
//		System.out.println(maxdigit);
		
		 
		//split by special character
//		String str = "Welcome234To567Java89Programming0@#!!";
//		String[] results = str.split("[^A-Za-z0-9]+");
//		for(String result:results) {
//			System.out.println(result);
//		}
		
		
	}

}
