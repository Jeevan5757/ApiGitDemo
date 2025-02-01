package Practise;

public class Day11_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "jeevan";
		word = word.toLowerCase();
		StringBuilder revword = new StringBuilder(word).reverse();
		System.out.println(revword);
		
		if(word.equals(revword.toString())) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
