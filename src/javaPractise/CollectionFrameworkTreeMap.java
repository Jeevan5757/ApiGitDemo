package javaPractise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionFrameworkTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",9,"C",6,"D"));
		
		tm.put(22, "T");
		tm.put(5, "J");
		System.out.println(tm);
		System.out.println(tm.ceilingEntry(8).getValue());
		System.out.println(tm.containsKey(4));
		System.out.println(tm.get(9));
		
		Entry<Integer,String> e = tm.firstEntry();
		System.out.println(e);
		System.out.println(e.getKey()+" "+e.getValue());

	}

}
