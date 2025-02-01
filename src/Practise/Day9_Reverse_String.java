package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day9_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "hackerearth";
		
		//convert string to list of string
//		List<String> listData = data.chars().mapToObj(c->data.valueOf((char)c)).collect(Collectors.toList());
//		System.out.println(listData);
		
		String result = new StringBuilder(data).reverse().toString();
		System.out.println(result);

	}

}
