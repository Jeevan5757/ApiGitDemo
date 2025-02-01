package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Day12_List_of_string_contain_specific_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List < String > colors =  Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
		
		String words = "orange";
		boolean isPresent = colors.stream().anyMatch(word->word.equalsIgnoreCase(words));
		System.out.println("is the word "+words+" present ?: "+isPresent);

	}

}
