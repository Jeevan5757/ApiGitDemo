package Practise;

public class Day9_factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 10;
		
		long fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.println(fact);

	}

}
