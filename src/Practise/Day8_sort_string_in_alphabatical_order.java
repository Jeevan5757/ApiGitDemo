package Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day8_sort_string_in_alphabatical_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");
		 colors.sort((str1,str2)->str1.compareToIgnoreCase(str2));
		 System.out.println("Sorting in alphabetical order"+colors);
		 
		 colors.sort((str1,str2)->str2.compareToIgnoreCase(str1));
		 System.out.println("Sorting in reverse alphabetical order"+colors);
		 
		 
		 List<Integer> number = Arrays.asList(10, 20, 5, 35, 2);
		 
		 number.sort(Comparator.naturalOrder());
		 System.out.println("Sorting in Ascending order"+number);
		 
		 number.sort(Comparator.reverseOrder());
		 System.out.println("Sorting in Descending order"+number);
		 

	}

}
