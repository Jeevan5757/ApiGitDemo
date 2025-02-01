package Practise2;

public class Day27_missingNumber_in_Array {
	
	public static void main(String[] args) {
		int [] number = new int[] {1,2,3,5,6};
		int total = number.length+1;
		System.out.println(total);
		int calculate = total * ((total+1)/2);
		System.out.println(calculate);
		int sum =0;
		for(int i: number) {
			sum += i;
		}
		System.out.println(sum);
		int missingNumber = calculate-sum;
		System.out.println("Missing number is: "+missingNumber);
	}

}
