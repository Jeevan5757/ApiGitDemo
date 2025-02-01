package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SumSquare{
	List<Integer> num;
	
	public SumSquare(List<Integer> nums) {
		this.num = nums;
	}
	public int odd() {
		
		//it will do fast filterout even data then maping to integer then sum then sum of square
//		int data = this.num.stream().filter(s->s%2==0).mapToInt(Integer::intValue).sum();
		//return data*data;
		
		//it will do fast filterout even data then square of each data then sum
		int data = this.num.stream().filter(s->s%2==0).mapToInt(n->n*n).sum();
		return data;
		
	}
	public int even() {
//		int data = this.num.stream().filter(s->s%2!=0).mapToInt(Integer::intValue).sum();
//		return data*data;
		
		int data = this.num.stream().filter(s->s%2!=0).mapToInt(n->n*n).sum();
		return data;
	}
}

public class Day11_sum_square_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List < Integer > nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		SumSquare ss = new SumSquare(nums);
		System.out.println(ss.odd());
		System.out.println(ss.even());

	}

}
