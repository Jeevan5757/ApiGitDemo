package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Day10_collectors_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Alice", "Bob", "Alice", "Charlie");
		
		Set<String> uniqueset = names.stream().collect(Collectors.toSet());
		System.out.println(uniqueset);
		
		//counting element
		Long count = names.stream().collect(Collectors.counting());
		System.out.println(count);
		
//Joins elements in a stream into a single String with an
		//optional delimiter, prefix, and suffix.
		
		String namejoin = names.stream().distinct().collect(Collectors.joining(",","[", "]"));
		System.out.println(namejoin);
		
		//Collectors.summarizingInt(), Collectors.summarizingDouble(), 
		//and Collectors.summarizingLong() provide a summary of data, 
		//including count, sum, min, average, and max.
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6));
		IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Average value: "+stats.getAverage());
		System.out.println("total data present in list: "+stats.getCount());
		System.out.println("max value: "+stats.getMax());
		System.out.println("min value: "+stats.getMin());
		System.out.println("sum value: "+stats.getSum());
		
		
		//grouping of element
		List<String> nam = List.of("Alice", "Bob", "Charlie", "David", "Alex");
		Map<Object, List<String>> groupbyfirstcharacter =nam.stream().collect(Collectors.groupingBy(name->name.charAt(0)));
		
		System.out.println(groupbyfirstcharacter);
		
		//Splits elements into two groups based on a predicate, 
		Map<Boolean, List<Integer>>  partitionedByEven  = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(partitionedByEven);
		
		//Mapping and Collecting
		List<Integer>  nameLengths  = nam.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
		System.out.println(nameLengths);
		
		//Collects elements into a Map using a key-mapper and value-mapper.
		Map<Object, Integer> nameLengthMap = nam.stream().collect(Collectors.toMap(name->name, String::length));
		
		System.out.println(nameLengthMap);
		
		//groupby length of string
		Map<Integer, List<String>>  groupByLength  = nam.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupByLength);
		
		

	}

}
