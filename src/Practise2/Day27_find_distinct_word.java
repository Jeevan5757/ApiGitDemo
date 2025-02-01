package Practise2;

import java.util.ArrayList;
import java.util.List;

public class Day27_find_distinct_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Big black Bug bit a big black dogon his big black Nose";
		String duplicateWord = distinctWord(name);
		System.out.println(duplicateWord);
		

	}
	
	public static String distinctWord(String name) {
		name = name.toLowerCase();
		String[] nameList = name.split(" ");
		ArrayList<String> duplicateWord = new ArrayList<>();
		for(String word: nameList) {
			if(!duplicateWord.contains(word)) {
				duplicateWord.add(word);
			}
		}
		String duplicateResult = String.join(" ", duplicateWord);
		return duplicateResult;
		
	}

}
