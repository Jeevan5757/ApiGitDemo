package javaPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionFramework1_ArrayList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> all = new ArrayList<>(5);
		ArrayList<Integer> all2 = new ArrayList<>(List.of(50,60,70,80,90));
		all.add(10);
		all.add(0, 5);
//		all.addAll(all2);
		all2.set(2, 30);
		all.addAll(1, all2);
		System.out.println(all);
		System.out.println(all.contains(25));
		System.out.println(all.equals(all2));
		System.out.println(all.get(4));
		System.out.println(all.indexOf(80));
		System.out.println(all.lastIndexOf(80));
		System.out.println(all.remove(3));
		System.out.println(all);
		
//		for(int i =0;i<all.size();i++) {
//			System.out.println(all.get(i));
//		}
//		for(Integer x:all) {
//			System.out.println(x);
//		}
//		for(var x:all) {
//			System.out.println(x);
//		}
		//using lambda expression
//		all.forEach((x) ->{
//			System.out.println(x);
//		});
		//lambda expression
//		all.forEach(System.out::println);
		//Iterator
//		Iterator<Integer> it = all.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//List Iterator
//		ListIterator<Integer> it = all.listIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
		
		all.forEach(n->show(n));
//		}

	}
	static void show(int n) {
		if(n>60)
			System.out.println(n);
	}

}
