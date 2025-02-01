package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Day8_average_of_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> num = new ArrayList<>(Arrays.asList(2.5,6.7,3.9,6.5,2.5));
		//Converts the Double objects into primitive double values (Double::doubleValue)
		double average = num.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println("Average of double is: "+average);
		
		double sum = num.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println("Sum of double is: "+sum);
		
		double countData = num.stream().mapToDouble(Double::doubleValue).count();
		System.out.println("number of data present: "+countData);
		
		double distinctSum = num.stream().mapToDouble(Double::doubleValue).distinct().sum();
		System.out.println("distinct sum is: "+distinctSum);
		
		double max = num.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
		System.out.println("max value is: "+max);
		double min = num.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
		System.out.println("max value is: "+min);
		
		OptionalDouble result = num.stream().mapToDouble(Double::doubleValue).filter(n->n>3.9).findAny();
		result.ifPresentOrElse(
				System.out::println,()->System.out.println("no value present"));
		
		num.stream().filter(n->n>3.5).forEach((x)->System.out.print(x+" "));

	}

}
