package Practise;

public class Day8_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Hackerearth";
		String data2 = "rank";
//		String s = data.repeat(3); //repeat the string
//		System.out.println(s);
//		String s = data.concat(data2); //concat two string
//		System.out.println(s);
		
		String formatdata = "Hello my name is %s and my age is %d";
//		String s = formatdata.formatted("jeevan",25); //format string using placeholder
//		System.out.println(s);
		
//		String s = data.indent(4); //it will give indentation
//		System.out.println(s);
		
//		String s = data.replace("a", "j"); //it will replace
//		System.out.println(s);
		
//		String s = data.replace("er", "j"); //it will replace
//		System.out.println(s);
		
//		String fruits = "apple orange banana apple";
//		String s = fruits.replaceAll("apple", "guava"); //it will replace
//		String z = fruits.replaceFirst("apple", "guava");
//		System.out.println(s);
//		System.out.println(z);
		
		String fruits = "apple orange banana apple";
		String[] d = fruits.split(" ");
		String s = String.join(",", d);
		System.out.println(s);

	}

}
