package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Day12_longest_smallest_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List < String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
		
		int maxLength = colors.stream().mapToInt(c->c.length()).max().orElse(0);
		System.out.println(maxLength);
		
		int minLength = colors.stream().mapToInt(String::length).min().orElse(0);
		System.out.println(minLength);

	}

}
