package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Day17 {
	public static void main(String[] args) {
		//maximum consecutive ones in a given array.
//		int[] array = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
//		int count =0;
//		int max = 0;
//		for(int i=0;i<array.length;i++) {
//			while(i<array.length && array[i] == 1) {
//				count++;
//				i++;
//			}
//			if(max<count) {
//				max=count;
//				
//			}
//			count =0;
//		}
//		System.out.println(max);
		
		//first and last position of given array
		
//		int firstIndex = -1;
//		int lastIndex = -1;
//		HashMap<Integer,Integer> hs = new HashMap<>();
//		int[] array = {5,7,7,8,8,10,8};
//		int num = 8;
//		for(int i=0;i<array.length;i++) {
//			if(array[i] == num && firstIndex==-1) {
//				firstIndex = i;
//			}
//			if(array[i] == num && firstIndex !=-1) {
//				lastIndex = i;
//			}
//			
//		}
//		System.out.println("first index for number "+num+"is: "+firstIndex+" and last index: "+lastIndex);
		
		//shift all 0 to the right
		
//		int[] inputArray = { 1, 0, 2, 0, 3, 0, 0, 0 };
//		ArrayList<Integer> newArray = new ArrayList<>();
//		ArrayList<Integer> arraywithoutzero = new ArrayList<>();
//		for(int i =0;i<inputArray.length;i++) {
//			if(inputArray[i] == 0) {
//				newArray.add(0);
//			}
//			else {
//				arraywithoutzero.add(inputArray[i]);
//			}
//		}
//		System.out.println(newArray);
//		arraywithoutzero.addAll(newArray);
//		System.out.println(arraywithoutzero);
		
		//remove duplicate from an array
//		int[] array = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
//		ArrayList<Integer> arrayList = new ArrayList<>(array.length);
//		for(int i =0;i<array.length;i++) {
//			arrayList.add(array[i]);
//		}
//		System.out.println(arrayList);
//		List<Integer> ls = arrayList.stream().distinct().collect(Collectors.toList());
//		System.out.println(ls);
//		for(int i =0;i<array.length;i++) {
//			if(!arrayList.contains(array[i]) ) {
//				arrayList.add(array[i]);
//			}
//
//		}
//		System.out.println(arrayList);
		
		//iterate using hashmap
		HashMap<String, String> hash_map = new HashMap<>();

		hash_map.put("India", "New Delhi");
		hash_map.put("France", "Paris");
		hash_map.put("Germany", "Berlin");
		hash_map.put("Australia", "Canberra");
		
//		Iterator<String> it = hash_map.keySet().iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			String value = hash_map.get(key);
//			System.out.println(key+": "+value);
//		}
		//convert hashmap keys to arraylist
		ArrayList<String> as = new ArrayList<>();
			for(String Key: hash_map.keySet()) {
			   as.add(Key);		
			}
			for(String value: hash_map.values()) {
				as.add(value);
		}
		System.out.println(as);
		
	}

}
