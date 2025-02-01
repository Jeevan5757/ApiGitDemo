package Practise;

public class Day13_largest_prime_factor {
	
	public static int largestPrimeFactor(int n) {
		int largestNumber = 1;
		while(n%2 ==0) {
			largestNumber = 2;
			n /=2;
		}
		for(int i =3;i<=Math.sqrt(n);i+=2) {
			while(n%i==0) {
				largestNumber = i;
				n /=i;
			}
		}
		if(n>2) {
			largestNumber =n;
		}
		return largestNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 36;
		System.out.println(largestPrimeFactor(number));
		

	}

}
