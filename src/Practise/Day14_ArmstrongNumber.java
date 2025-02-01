package Practise;

public class Day14_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 371;
		int originalNumber = n;
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum +=Math.pow(digit, 3);
			n /=10;
		}
		if(originalNumber==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a armstrong number");
		}

	}

}
