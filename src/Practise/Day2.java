package Practise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Day2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		 int i = scan.nextInt();
//		 scan.nextLine();
//		 String s = scan.nextLine();
//		 Double d = scan.nextDouble();
//		 scan.close();
//
//	        // Write your code here.
//
//	        System.out.println("String: " + s);
//	        System.out.println("Double: " + d);
//	        System.out.println("Int: " + i);
//		
//		  Scanner sc=new Scanner(System.in);
//          System.out.println("================================");
//          for(int i=0;i<3;i++){
//              String s1=sc.next();
//              int x=sc.nextInt();
//              System.out.printf("%-15s%03d%n",s1,x);
//          }
//          System.out.println("================================");
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());

	        bufferedReader.close();
	        for(int i=1;i<10;i++) {
	        	System.out.println(N+" x "+i+"="+N*i);
	        }

	}

}
