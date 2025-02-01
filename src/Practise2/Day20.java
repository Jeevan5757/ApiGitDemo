package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonacci series
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		List<Integer> k = new ArrayList<> (Arrays.asList(0,1));
//		if (n==1) {
//			System.out.println(0);
//		}
//			else if(n==2) {
//				System.out.println(k);
//		
//		}
//			else {
//				for(int i=2;i<=n;i++) {
//					int sum = k.get(i-1) +k.get(i-2);
//					k.add(i, sum);
//				}
//			}
//		System.out.println("fibonnacie series of "+n+" is: "+k);
//
//	
	
	//reverse a numberband number is palindrom or not
	
//	int n = 123;
//	StringBuilder sb = new StringBuilder(String.valueOf(n));
//	sb.reverse();
//	System.out.println(sb);
//	int k = Integer.parseInt(sb.toString());
//	if(k==n) {
//		System.out.println("palindrom");
//	}
//	else {
//		System.out.println("Not a palindrom");
//	}
		
		int n = 6;
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
