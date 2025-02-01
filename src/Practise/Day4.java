package Practise;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lineNumber =1;
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(lineNumber+" "+s);
			lineNumber++;
		}
		sc.close();

	}

}
