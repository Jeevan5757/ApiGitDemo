package Practise;

import java.util.Arrays;
import java.util.List;

public class Day11_multiplyListofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);
		int multiply = nums.stream().reduce(1,(a,b)->a*b).intValue();
		System.out.println(multiply);
		
		int sum = nums.stream().reduce(0,(a,b)->a+b).intValue();
		System.out.println(sum);

	}

}
