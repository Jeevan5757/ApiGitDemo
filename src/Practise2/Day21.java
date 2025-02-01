package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number = 30;
//		int count =0;
//		if(number<1) {
//			System.out.println("Not a prime number");
//			return;
//		}
//		for(int i=2;i<=number/2;i++) {
//			if(number%i==0) {
//				count++;
//			}
//		}
//	   if(count>0) {
//		   System.out.println("Not a prime number");
//	   }
//	   else {
//		   System.out.println("prime number");
//	   }
		
//		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(5,34,23,12));
//		int maxValue = num.stream().mapToInt(x->x.intValue()).max().orElse(0);
//		System.out.println(maxValue);
//		//using collections
//		System.out.println(Collections.max(num));
		
		//sum of digits
//		int num = 987;
//		int sum =0;
//		while(num !=0) {
//			int value = num%10;
//			sum += value;
//			num = num/10;
//		}
//		System.out.println(sum);
		
		//count digit in an integer number
//		int num = 29845315;
//		int count =0;
//		while(num!=0) {
//			num = num/10;
//			count++;
//		}
//		System.out.println(count);
//		
		//or
//		String result = Integer.toString(num);
//		System.out.println(result.length());
		
//		String name = "Mama";
//		StringBuilder sb = new StringBuilder(name).reverse();
//		System.out.println(sb);
		
		//remove space from given string
		
//		String name = "hello java Learning";
//		name = name.replaceAll("\\s","");
//		System.out.println(name);
		
		//common element in an array
		
//		Integer[] array1 = { 4, 2, 3, 1, 6 };
//		Integer[] array2 = { 6, 7, 8, 4 };
//		ArrayList<Integer> ai = new ArrayList<>();
//		for(int i=0;i<array1.length;i++) {
//			for(int j=0;j<array2.length;j++) {
//				if(array1[i]==array2[j]) {
//					ai.add(array1[i]);
//				}
//			}
//			System.out.println(ai);
//		}
		
		//using arrayList
//		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(4, 2, 3, 1, 6));
//		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(6, 7, 8, 4));
//		a1.retainAll(a2);
//		System.out.println(a1);
		
		//using java stream
//		String[] array3 = { "Java", "JavaScript", "C", "C++" };
//		String[] array4 = { "Python", "C#", "Java", "C++" };
//		
//		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(array3));
//		ArrayList<String> a2 = new ArrayList<>(Arrays.asList(array4));
//		
//		List<String> a3 = a1.stream().filter(a2::contains).collect(Collectors.toList());
//		System.out.println(a3);
		
		//first and last element
//		Integer[] array1 = { 4, 2, 3, 1, 6 };
//		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(array1));
//		System.out.println(a1.get(0));
//		System.out.println(a1.get(a1.size()-1));
		
		//second largest and second smallest number
//		int[] arrayList = { 4, 2, 3, 1,0, 6,12,15,20 };
//		Arrays.sort(arrayList);
//		System.out.println(Arrays.toString(arrayList));
//		
//		System.out.println(arrayList[arrayList.length-2]);
//		System.out.println(arrayList[2]);
		
		//
		String sent = "Java is a programming java. Java is widely used in software Testing";
		//to remove Punctuation
		String[] as = sent.replaceAll("[^a-zA-Z ]","").split(" ");
		String input = "Java";
		ArrayList<String> als = new ArrayList<>(Arrays.asList(as));
		System.out.println(als);
		int count = 0;
		for(int i =0;i<als.size();i++) {
			if(input.equalsIgnoreCase(als.get(i))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
