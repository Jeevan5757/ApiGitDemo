package Practise;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int sum = a;
//            for(int j =0;j<n;j++) {
//            	sum = sum+ (int)Math.pow(2, j)*b;
//            	System.out.print(sum+" ");
//            }
//        }
//        in.close();
//		
		 Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127)System.out.println("* byte");
	                if(x>=-32768 && x<=32767)System.out.println("* short");
	                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
	                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
	                //Complete the code
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }
		        }
		
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
//		
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);



	}

}
