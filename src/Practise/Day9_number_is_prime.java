package Practise;


class PrimeNumber{
	public static void isPrime(int n) {
		if(n <1) {
			System.out.println("Not a Prime Number");
		}
		else {
			boolean isprime = true;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i == 0) {
					isprime = false;
					
					break;
				}
			}
			if(isprime) {
				System.out.println("Not a prime number");
			}
			else {
					System.out.println("Prime Number");
			}
		}
	}
}

public class Day9_number_is_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber.isPrime(10);

	}

}
