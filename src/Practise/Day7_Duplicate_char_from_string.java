package Practise;

//class duplicate{
//	String data = "hackerearth";
//	public void duplicateword() {
//		
//	}
//}


public class Day7_Duplicate_char_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Hackerearth";
//		String s = data.toLowerCase();
//		char[] Character = s.toCharArray();
//		System.out.println(Character);
//		System.out.println(s);
//		boolean isNotDuplicate = false;
//		
//		for(int i=0;i<s.length();i++) {
////			System.out.println(s.charAt(i));
//			boolean isDuplicate = false;
//			for(int j = i+1;j<s.length();j++) {
//				if(Character[i] == Character[j]) {
//					isDuplicate = true;
//					break;
//				}
//			}
//			if(isDuplicate) {
//				System.out.print(Character[i]);
//				isNotDuplicate = true;
//			}
//		}
//		
//		if(!isNotDuplicate) {
//			System.out.println("No duplicates are found!");
		
		
//		}
		
	StringBuilder duplicate = new StringBuilder();
	int[] count = new int[256];
	String s = data.toLowerCase();
	s.chars().forEach(x-> {
		count[x]++;
	   	System.out.println("Char of "+(char)x+" have count "+count[x]);
	});
	
	System.out.println("Duplicate character are: ");
	s.chars().distinct().filter(c->count[c]>1).forEach(c-> duplicate.append((char)c+" "));
	
	if(duplicate.isEmpty()) {
		System.out.println("no duplicate record found");
	}
	else {
	System.out.println(duplicate.toString());
	}
	}

}
