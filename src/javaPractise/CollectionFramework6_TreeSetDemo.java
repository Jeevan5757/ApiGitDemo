package javaPractise;

import java.util.List;
import java.util.TreeSet;

public class CollectionFramework6_TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10));
		ts.add(25);
		System.out.println(ts);
		System.out.println(ts.ceiling(35)); //if 35 not present then it will give number that is nearest which is greater
        
	}

}
