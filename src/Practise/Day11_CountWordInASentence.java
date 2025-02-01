package Practise;

import java.util.Arrays;

public class Day11_CountWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java lambda expression.";
//		long count = text.chars().filter(c->c!=' ').count();
//		System.out.println(count);
		String[] listData = text.split(" ");
		String data = Arrays.toString(listData);
		int count = listData.length;
		System.out.println(count);

	}

}
