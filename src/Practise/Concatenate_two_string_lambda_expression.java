package Practise;

import java.util.function.BiFunction;

public class Concatenate_two_string_lambda_expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,String> concatenate = (str1,str2) ->str1+str2;
		
		String string1 = "Good ";
        String string2 = "Morning!";
        
        String result = concatenate.apply(string1, string2);
        System.out.println(result);

	}

}
