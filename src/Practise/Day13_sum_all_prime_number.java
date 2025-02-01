package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Day13_sum_all_prime_number {


public static boolean isPrime(int n) {
	if(n<=1) {
		return false;
	}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0){
				return false;
				
		}
	}
		return true;
}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start_prime = 100;
	     int end_prime = 200;
	     
	     //print prime number from range
	     //.boxed() converts the IntStream into a Stream<Integer> for easier collection into a list.
	     List<Integer> primeNumber = IntStream.rangeClosed(start_prime, end_prime)
	    		 .filter(Day13_sum_all_prime_number::isPrime).boxed().toList();
	     
	     System.out.println(primeNumber);
	     
	     //print hoe many prime number present
	     long countPrime = IntStream.rangeClosed(start_prime, end_prime)
	    		 .filter(Day13_sum_all_prime_number::isPrime).count();
	     System.out.println(countPrime);
	     
	     //print sum of prime number
	     long sumOfPrime = IntStream.rangeClosed(start_prime, end_prime)
	    		 .filter(Day13_sum_all_prime_number::isPrime).sum();
	     System.out.println(sumOfPrime);

	}

}
