package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Day6_JavaIterator {
	
	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while(it.hasNext()) {
			Object element = it.next();
			if(element instanceof String) {
				System.out.println("Found String: "+element);
				break;
			}
		}
		return it;
		
		
	}
	   
	
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> mylist = new ArrayList<String>();
//		mylist.add("Hello");
//        mylist.add("Java");
//        mylist.add("4");
//        Iterator<String> it = mylist.iterator();
//        while(it.hasNext()) {
//        	 Object element = it.next();
//             System.out.println((String)element);
//        }
		ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      for(int i = 0;i<n;i++){
	         mylist.add(sc.nextInt());
	      }
	      
	      mylist.add("###");
	      for(int i=0;i<m;i++){
	         mylist.add(sc.next());
	      }
	      
	      Iterator it=func(mylist);
	      while(it.hasNext()){
	         Object element = it.next();
	         System.out.println((String)element);
	      }

	}

}
