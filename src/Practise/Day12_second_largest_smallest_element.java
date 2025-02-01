package Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day12_second_largest_smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = {
			      1,
			      7,
			      18,
			      25,
			      77,
			      300,
			      101
			    };
		
		List<Integer> number = Arrays.asList(nums);
		int secondlargest =number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(secondlargest);
		
		int secondLowest = number.stream().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst().orElse(null);
		System.out.println(secondLowest);

	}

}
