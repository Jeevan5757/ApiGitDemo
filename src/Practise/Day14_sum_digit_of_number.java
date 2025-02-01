package Practise;

public class Day14_sum_digit_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int sum =0;
		
		String num = Integer.toString(n);
		for(int i=0;i<num.length();i++) {
			int j = (int) num.charAt(i)-'0'; //because the Unicode value for '0' is 48
			sum +=j;
		}
		System.out.println(sum);

	}

}
