package Practise;

import java.util.*;
import java.security.*;

public class Day4_convertIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			String s = Integer.toString(n);
			System.out.println(s);
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
				System.out.println(n);
			} else {
				System.out.println("Wrong answer.");
				System.out.println(n);
			}
		} catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}

	}

}

