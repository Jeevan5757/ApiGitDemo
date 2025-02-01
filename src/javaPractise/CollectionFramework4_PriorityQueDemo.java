package javaPractise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class mycom implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2) return 1;
		if(o1>o2) return -1;
		else return 0;
	}
	
}

public class CollectionFramework4_PriorityQueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p = new PriorityQueue<>(new mycom());
		
		p.add(20);
		p.add(30);
		p.add(5);
		p.add(4);
		p.add(40);
		p.add(50);
		p.add(3);
//		System.out.println(p.peek());
		p.forEach((x)->System.out.println(x));
		p.poll();
		System.out.println("after deletetion");
		p.forEach((x)->System.out.println(x));
		

	}

}
