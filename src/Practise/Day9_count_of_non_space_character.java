package Practise;

public class Day9_count_of_non_space_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is jeevan";
//		int count =0;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i) != ' ') {
//				count += 1;
//			}
//		}
//		System.out.println(count);
		
		//using lambda expression
		
		long count =str.chars().filter(c->c!=' ').count();
		System.out.println(count);
		

	}

}
