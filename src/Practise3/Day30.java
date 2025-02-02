package Practise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Day30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3,2,4,5,1,12,13,-7};
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,3,7,12,13,14));
		reverseLinkedLIst(ll);
		
		int[] array1 = {1, 2, 3, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        
        if(isBothArrayEqual(array1,array2)) {
        	System.out.println("Both array having equal element.");
        }
        else {
        	System.out.println("Both are are not having equal element.");
        }
        
//        int[] array = { 1, 2, 3, 4, 5 };
        Integer[] array = { 1, 2, 3, 4, 5 };
        arraySum(array);
		

	}
	public static void reverseLinkedLIst(LinkedList<Integer> ll) {
//		LinkedList<Integer> ll1 = new LinkedList<>();
//		ll.descendingIterator().forEachRemaining(ll1::add);
//		System.out.println(ll1);
		
		//or
		Collections.reverse(ll);
		System.out.println("reversed linked list: "+ll);
		Collections.sort(ll);
		System.out.println("Printing in ascending order: "+ll);
		ll.sort(Collections.reverseOrder());
		System.out.println("Printing in descending order: "+ll);
	}
	
	public static boolean isBothArrayEqual(int[] arr1, int[] arr2) {
		if(arr1.length != arr1.length) {
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
	public static void arraySum(Integer[] arr) {
//		int sum = Arrays.stream(arr).sum();
		int sum = Arrays.stream(arr).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println("jeevan jyoti behera 2nd user");
	}
	
	

}
