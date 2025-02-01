package javaPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CollectionFramework_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> tm = new HashMap<>(Map.of(0,"A",1,"B",9,"C",6,"D"));
		
		tm.put(22, "T");
		tm.put(5, "J");
		System.out.println(tm);
		System.out.println(tm.containsKey(4));
		System.out.println(tm.get(9));
		

	}

}
