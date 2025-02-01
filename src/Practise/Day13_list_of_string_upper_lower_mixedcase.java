package Practise;

import java.util.Arrays;
import java.util.List;

public class Day13_list_of_string_upper_lower_mixedcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@FunctionalInterface
		interface caseCheck {
			boolean checkCase(String str);
		}
		List < String > strings = Arrays.asList("Java", "JAVA", "java");
		caseCheck isUpperCase = str->str.equals(str.toUpperCase());
		
		caseCheck isLowerCase = str->str.equals(str.toLowerCase());
		strings.forEach(c->{
		  if(isUpperCase.checkCase(c)) {
			  System.out.println(c+" is upercase");
		  }
		  else if(isLowerCase.checkCase(c)){
			  System.out.println(c+" is lowercase");
		  }
		  else {
			  System.out.println(c+" is mixedcase");
		  }
	});
		

}
}
