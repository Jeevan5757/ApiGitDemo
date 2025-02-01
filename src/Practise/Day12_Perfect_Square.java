package Practise;

import java.util.function.Predicate;

public class Day12_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isperfectsquare = n->{
			int sqrt = (int)Math.sqrt(n) ;
					return sqrt*sqrt == n;
		};
		int n = 42;
		boolean result = isperfectsquare.test(n);
		System.out.println("is "+n+" is a perfect square? "+result);
		
	}

}
