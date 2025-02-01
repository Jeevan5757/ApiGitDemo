package Practise;

import java.util.Arrays;
import java.util.List;

public class Day1_list_of_string_to_upper_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Jeevan","Muna","munu","KUNA");
		
		System.out.println("OriginalData");
		for(String name:names) {
			System.out.println(name);
		}
		names.replaceAll(str->str.toUpperCase());
		System.out.println("UPPERCASE");
		for(String name:names) {
			System.out.println(name);
		}
		names.replaceAll(str->str.toLowerCase());
		System.out.println("LOWERCASE");
		for(String name: names) {
			System.out.println(name);
		}
	}

}
