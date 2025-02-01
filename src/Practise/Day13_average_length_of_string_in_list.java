package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day13_average_length_of_string_in_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> colors = Arrays.asList("Red", "Black", "White", "Orange", "Blue");
		double average = colors.stream().mapToInt(String::length)
				.average().orElse(0);
		System.out.println(average);

	}

}
