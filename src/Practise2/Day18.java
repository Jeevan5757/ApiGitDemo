package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verify if data contains in a list or not
//		List<String> ls = new ArrayList<>();
//		ls.add("Jeevan");
//		ls.add("Muna");
//		ls.add("Kunu");
//		ls.add("Kuna");
//		ls.add("Liza");
//		
//		System.out.println(ls.contains("Jeevan"));
//		System.out.println(ls.contains("Dimple"));
//		
//		Map<Integer,String> hsmap = new HashMap<>();
//		hsmap.put(1, "Abhi");
//		hsmap.put(2, "Gourav");
//		hsmap.put(3, "SKP");
//		System.out.println(hsmap.containsKey(2));
//		System.out.println(hsmap.containsValue("jeev"));
		
		//reverse arraylist 
//		ArrayList < String > arrlist = new ArrayList < String > (Arrays.asList("Jeevan","Muna",
//				                                       "Munu","Kuna"));
//		System.out.println(arrlist);
//		Collections.reverse(arrlist);
//		System.out.println(arrlist);
//		
//		//convert ArrayList to LinkedList and vice versa.
//		
//		LinkedList<Integer> ls = new LinkedList<>();
//		Random random = new Random();
//		int i =0;
//		while(i<10) {
//			ls.add(random.nextInt(1, 100));
//			i++;
//		}
//		System.out.println(ls);
//		
//		ArrayList<Integer> as = new ArrayList<>(ls);
//		System.out.println(as);
//		
//		System.out.println("is arraylist a arraylist?: "+(arrlist instanceof ArrayList));
		
		// highest and lowest values of a List
//		
//		ArrayList<Integer> asrlist = new ArrayList<>();
//		Random random = new Random();
//		int i = 0;
//		while(i<20) {
//			asrlist.add(random.nextInt(100));
//			i++;
//		}
//		System.out.println(asrlist);
//		
//		int maxValue = asrlist.stream().mapToInt(Integer::intValue).max().orElse(0);
//		int minValue = asrlist.stream().mapToInt(integer->integer.intValue()).min().orElse(0);
//		System.out.println("Max value is: "+maxValue+"\nmin value is: "+minValue);
		
		//makking collection read only
		List<String> stuff = Arrays.asList("a","c","d");
		List<String> list = new ArrayList<>(stuff);
		list = Collections.unmodifiableList(list);
		//below two line throw error because we did unmodifiable
//		list.add("c");
//		System.out.println(list);
	}

}
