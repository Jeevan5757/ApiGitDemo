package Practise2;

public class Day19 {
	
	public void isArmstrong(int n) {
		int sum =0;
		int temp = n;
		while(temp>0) {
			int value = temp % 10;
			sum = (int) (sum + Math.pow(value, 3));
			temp = temp/10;
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swap two number
//		int a = 10;
//		int b = 20;
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a);
//		System.out.println(b);
//		temp = a+b;
//		a = temp-a;
//		b = temp-b;
//		System.out.println(a);
//		System.out.println(b);
		
		//armstrong number
		
		Day19 arms = new Day19();
		arms.isArmstrong(157);
		
		
		

	}

}
