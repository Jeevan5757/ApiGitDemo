package Practise2;

import java.util.ArrayList;

public class Day27_find_duplicate_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Big black Bug bit a  big black dogon his  big black Nose";
		name = name.toLowerCase();
		findDuplicateWord(name);

	}
	public static void findDuplicateWord(String name) {
		int count;
		String[] nameList = name.trim().replaceAll("\\s+"," ").split(" ");
		ArrayList<String> duplicateWord = new ArrayList<>();
		for(int i=0;i<nameList.length;i++) {
			count =1;
			for(int j=i+1;j<nameList.length;j++) {
				if(nameList[i].equals(nameList[j])) {
					count++;
					nameList[j] = "0";
				}
			}
			if(count>1 && !nameList[i].equals("0")) {
				System.out.println(nameList[i]);
			}
			
		}
	}

}
