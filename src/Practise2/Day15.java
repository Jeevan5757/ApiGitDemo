package Practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count the capitalized character in a string
//		String name = "JeevanJyotiBehera";
//		long count = name.chars().filter(c->Character.isUpperCase(c)).count();
//		System.out.println("number of capitalized character in a word present is: "+count);
//		
//		StringBuilder sb = new StringBuilder();
//		//print capitalized character from a string
//		name.chars().filter(c-> Character.isUpperCase(c)).forEach(c-> sb.append((char)c));
//		System.out.println(sb);
		
//		//count capitalized word from string in starting of word 
//		String sentence = "Hello World ThIs is a Test String with Capitalized Words";
//		List<String> sentenceList = Arrays.asList(sentence.split(" "));
//		System.out.println(sentenceList);
//		Long count = sentenceList.stream().filter(c->Character.isUpperCase(c.charAt(0))).count();
//		System.out.println(count);
//		
//		//count capitalized word from string from anywhere in the sentence
//		long counts = sentence.chars().filter(Character::isUpperCase).count();
//		System.out.println(counts);
//		////print capitalized word from string in starting of word 
//		StringBuilder sb = new StringBuilder();
//		sentenceList.stream().filter(c->Character.isUpperCase(c.charAt(0))).forEach(c->sb.append(c+" "));
//		System.out.println(sb);
		
		
		int longestStreak =1;
		int currentStreak = 1;
		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
		Arrays.sort(arr);
		List<Integer> arrlist = new ArrayList<>();
		for(int a:arr) {
			arrlist.add(a);
		}
		System.out.println(arrlist);
		for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // Skip duplicate numbers
                continue;
            }
            if (arr[i] == arr[i - 1] + 1) {
                // Consecutive number, increase the streak
                currentStreak++;
            } else {
                // Not consecutive, update longest streak and reset current streak
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;  // Reset streak when numbers are not consecutive
            }
        }
		 longestStreak = Math.max(longestStreak, currentStreak);
		System.out.println("Longest streak is:\n"+longestStreak);
		
	}

}
