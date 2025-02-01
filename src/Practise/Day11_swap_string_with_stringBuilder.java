package Practise;

public class Day11_swap_string_with_stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		StringBuilder sb = new StringBuilder(str1);
		sb.append(str2);
		str2 = sb.substring(0,str1.length());
		str1 = sb.substring(str2.length());
		System.out.println(str2);
		System.out.println(str1);

	}

}
