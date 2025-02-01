package javaPractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionFramework_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedHashMap<Integer,String> lhs = new LinkedHashMap<>(5,.75f,true) {
		LinkedHashMap<Integer,String> lhs = new LinkedHashMap<>(5) {
			//this method will say when we will remove the eldest entry
			//based on insertion or access
			protected boolean removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
		};
		
		//if true based on access will be ordered
		
		lhs.put(1, "A");
		lhs.put(7, "F");
		lhs.put(4, "T");
		lhs.put(11, "Z");
		lhs.put(6, "E");
		String s = lhs.get(11);
		lhs.put(8,"S");
		System.out.println(lhs);
		lhs.forEach((k,v)->System.out.println(k+" "+v));
		

	}

}
