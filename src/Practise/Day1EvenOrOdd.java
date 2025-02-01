package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day1EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(3,6,9,14,17,18);
		List<Integer> even_number = num.stream().filter(n -> n %2==0).collect(Collectors.toList());
		List<Integer> odd_number = num.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		System.out.println(even_number);
		System.out.println(odd_number);

	}

}
