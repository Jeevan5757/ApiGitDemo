package Practise;

import java.util.List;
import java.util.stream.Collectors;

public class Day10_printing_fast_3_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //printing 1st 3 string in a list
		 List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
		 List<String> firstThreeNameList = names.stream().limit(3).collect(Collectors.toList());
		 System.out.println(firstThreeNameList);
		 
		 String firstThreeName =names.stream().limit(3).collect(Collectors.joining(","));
		 System.out.println(firstThreeName);

	}

}
