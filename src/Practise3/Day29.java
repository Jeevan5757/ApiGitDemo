package Practise3;

import java.util.List;

public class Day29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(reverse(str));	
		
		System.out.println(containsowel("jeevan"));
		System.out.println(containsowel("asdf"));
		System.out.println(isPrime(10));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(21));
		fibonancieNumber(10);
		List<Integer> ls = List.of(2,3,6,7,9);
		System.out.println("");
		System.out.println(onlyOddNumber(ls));
		System.out.println(removeSpace("jeevan jyoti behera"));

	}
	
	public static StringBuilder reverse(String n) {
		StringBuilder sb = new StringBuilder(n);
		return sb.reverse();
	}
	
	public static boolean containsowel(String n) {
		return n.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		if(n>2) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void fibonancieNumber(int n) {
		int a =0;
		int b =1;
		int c = 1;
		for(int i=1;i<=n;i++) {
			System.out.print(a+", ");
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public static boolean onlyOddNumber(List<Integer>list) {
		return list.parallelStream().anyMatch(x->x%2!=0);
	}
	
	public static String removeSpace(String name) {
		return name.replace(" ", "");
	}

}
