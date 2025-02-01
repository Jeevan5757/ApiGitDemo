package javaPractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionFramework2_LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> all = new LinkedList<>();
		LinkedList<Integer> all2 = new LinkedList<>(List.of(50,60,70,80,90));
		all.add(10);
		all.add(0, 5);
//		all.addAll(all2);
		all2.set(2, 30);
		all.addAll(1, all2);
		System.out.println(all);
		all.addFirst(100);
		all.addLast(200);
		System.out.println(all);
		System.out.println(all.getFirst());
		System.out.println(all.getLast());
		System.out.println(all.peek());
		System.out.println(all);

	}

}
