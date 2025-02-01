package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day14_fibonancie_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibLength;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length of fibonancie series: ");
		fibLength = sc.nextInt();
		List<Integer> ls = new ArrayList<>(Arrays.asList(0,1));
		if(fibLength==0) {
			System.out.println(0);
		}
		else if(fibLength==1) {
			System.out.println(ls);
		}
		else {
			for(int i=2;i<=fibLength;i++) {
				int nextfib = ls.get(ls.size()-1) + ls.get(ls.size()-2);
				ls.add(nextfib);
			}
			System.out.println(ls);
		}
		

	}

}
