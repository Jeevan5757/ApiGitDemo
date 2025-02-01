package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day8_remove_duplicate_from_list_of_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] num = {1,5,9,2,6,1,9,3,5,3};
		List<Integer> listnum = new ArrayList<>(Arrays.asList(num));
		System.out.println(listnum);
		List<Integer> uniquenum = new ArrayList<>();
		listnum.stream().distinct().forEach(uniquenum::add);
		System.out.println("unique list: "+uniquenum);

	}

}
