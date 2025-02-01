package Practise2;

public class Day27_swapVariable_without_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		String name1 = "Jeevan";
		String name2 = "Muna";
		name2 = name1.concat(name2);
		System.out.println(name2);
		name1 = name2.substring(name1.length());
		System.out.println(name1);
		name2 = name2.substring(0,name2.length()-name1.length());
		System.out.println(name2);

	}

}
