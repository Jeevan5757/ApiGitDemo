package javaPractise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionFramework3_ArrayDequeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.offerFirst(10);
		dq.offerFirst(20);
		dq.offerFirst(30);
		dq.offerFirst(40);
//		dq.forEach((x)->System.out.println(x));
		dq.offerLast(1);
		dq.offerLast(7);
		dq.forEach((x)->System.out.println(x));

	}

}
