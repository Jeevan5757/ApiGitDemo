package javaPractise;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionFramework5_HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it gives unique value
		HashSet<Integer> hs = new HashSet<>(20,0.25f);
		Set<String> set = new HashSet<>();
		Random random = new Random();
//		int i=20;
//		while(i >1) {
//			hs.add(random.nextInt(100));
//			i--;
//		}
		hs.add(20);
		hs.add(20);
		System.out.println(hs);
		
		set.add("A");
		set.add("B");
		set.add("A");
		System.out.println(set);
	}

}
