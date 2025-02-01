package Practise2;

import java.util.Arrays;

public class Day28_move_zero_to_last_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,0,4,0,0,6,8,9,0};
		int n = array.length;
	    moveZeroToEnd(array);
	    System.out.println("Modified Array: " + Arrays.toString(array));

	}
	public static void moveZeroToEnd(int[] arr) {
		
		int index =0;
		
		for(int num:arr) {
			if(num != 0) {
				arr[index++] = num;
			}
		}
		while (index < arr.length) {
            arr[index++] = 0;
        }
		
	}

}
