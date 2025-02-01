package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> num = new ArrayList<Integer>();
//		int i =10;
//		while(i>0) {
//			Random random = new Random();
//			int randnum = random.nextInt(1, 10);
//			num.add(randnum);
//			i--;
//		}
//		System.out.println(num);
//		
//		
//		List<Integer> oddnum = num.stream().filter(n->n%2 !=0).collect(Collectors.toList());
//		System.out.println(oddnum);
//		
//		for(int j=0;j<num.size();j++) {
//			if(num.get(j) % 2 == 0) {
//				num.remove(j);
//				j--;
//			}
//		}
//		System.out.println(num);
//		
//		Set<Integer> seen = new HashSet<>();
//		Set<Integer> duplicate = new HashSet<>();
//		
//		for(Integer dpnum : num) {
//			if(!seen.add(dpnum)) {
//				duplicate.add(dpnum);
//			}
//		}
//		System.out.println("duplicate data are: "+duplicate);
//		System.out.println("unique data are: "+seen);
		
		List<String> input = Arrays.asList("jeevan","muna","abhinash","tapas");
		System.out.println(input);
//		
//		for(int i=0;i<input.size();i++) {
//			String length = input.get(i);
//			int leng = length.length();
//			data.put(input.get(i), leng);
//		}
//		System.out.println(data);
//		
//		System.out.println(data.containsValue(4));
//		System.out.println(data.get("tapas"));
		
		 Map<String,Integer> data = input.stream().collect(Collectors.toMap(
				str -> str,
				str -> str.length()
				));
		 
		 System.out.println(data);

	}

}
