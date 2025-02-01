package Practise;

import java.util.Arrays;

public class Day12_String_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " Jeevan Jyoti  Behera ";
		String[] listname =  name.trim().split("[\\W_]+");
		System.out.println(Arrays.toString(listname));
//		String firstname = listname[0].substring(0, 1).toLowerCase();
//		String middlename = listname[1].substring(0, 1).toLowerCase();
//		String lastname = listname[2].toLowerCase();
//		String result = String.join(" ", firstname,middlename,lastname);
//		System.out.println(result);
//		
		//more dynamic
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<listname.length-1;i++) {
			sb.append(listname[i].substring(0,1).toLowerCase()).append(" ");
		}
		sb.append(listname[listname.length-1].toLowerCase());
		System.out.println(sb);
		
		//want to split by special character
//		String name = " Jeevan @# Jyoti _ !Behera ";
//		String[] listname =  name.trim().split("[\\W_]+");
		//The regular expression [\\W_]+ matches one or more non-word characters.
		//The \\W matches any character that is not a letter, 
		//digit, or underscore (essentially, all special characters). 
		//The _ is also treated as a non-word character, so it's included here.
		
		//want to split by digit
//		String name = " Jeevan12 Jyoti 45 Behera ";
//		String[] listname =  name.trim().split("\\d+");
		

	}

}
