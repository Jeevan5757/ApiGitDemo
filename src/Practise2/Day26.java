package Practise2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "This this is is done by Saket Saket".toLowerCase();
		 String[] list = str.split(" ");
		 HashMap<String,Integer> data = new HashMap<String,Integer>();
		 //number of letter present in each word in a string
//		 for(int i=0;i<list.length;i++) {
//			 int length = list[i].length();
//			 data.put(list[i], length);
//		 }
//		 System.out.println(data);
//		 for(int i=0;i<list.length;i++) {
//			 if(data.containsKey(list[i])) {
//				 int count = data.get(list[i]);
//				 data.put(list[i], count+1);
//			 }
//			 else {
//				 data.put(list[i], 1);
//			 }
//		 }
//		 System.out.println(data);
		 
//		 HashMap<Integer,String> map = new HashMap<>();
//	        map.put(2, "Saket");
//	        map.put(25, "Saurav");
//	        map.put(12, "HashMap");
//	        System.out.println(map.size());
//	       map.forEach((key,value)->System.out.println(key+"->"+value));
//	       for(Entry<Integer, String> entry: map.entrySet()) {
//	    	   System.out.println("Key is: "+entry.getKey()+" vlaue is: "+entry.getValue());
//	       }
		 
		 String name = "mjkjM";
		 StringBuilder reverse = new StringBuilder(name).reverse();
		 String reverseString = new String(reverse);
		 
		 if(name.equalsIgnoreCase(reverseString)) {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("not a palindrome");
		 }

	}

}
