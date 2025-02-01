package Practise;

public class Day2_Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.printf("This is formated String",123);
//		System.out.printf("This is formated String %d",123); //123 will add at last where i will give %d there 123 will print
		
		//conversion character
		boolean Myboolean = true;
		char mychar = '@';
		String mystring = "jeevan";
		int myint = 50;
		Double mydouble = 10000.40;
//		System.out.printf("%b", Myboolean);
//		System.out.printf("%c", mychar);
//		System.out.printf("%s", mystring);
//		System.out.printf("%d", myint);
//		System.out.printf("%f", mydouble);
		
		//width //minimum number of character to be written as output
//		System.out.printf("Hello %15s", mystring); //if we will give -15s then after printing of mystring 15 space will print
		
		//precesion
//		System.out.printf("You have this much money %.2f",mydouble);
		
		//flags
//		System.out.printf("You have this much money %20f",mydouble); //it will give 20 space
//		System.out.printf("You have this much money %+f",mydouble); //if number is posetive then print + else -
//		System.out.printf("You have this much money %010f",mydouble); //numeric value with zero padded
		System.out.printf("You have this much money %,f",mydouble); //,grouping separator ex number 10000 output 10,000

	}

}
