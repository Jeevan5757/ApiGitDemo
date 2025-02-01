package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Day10_max_min_number_of_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = Arrays.asList(4,7,10,23,2,1,31,45,20);
		
		int maxValue = num.stream().mapToInt(x->x.intValue()).max().orElse(0);
		int minvValue = num.stream().mapToInt(Integer::intValue).min().orElse(0);
		System.out.println(maxValue);
		System.out.println(minvValue);

	}

}
