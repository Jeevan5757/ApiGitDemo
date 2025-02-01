package javaPractise;

@FunctionalInterface
interface MyLamb{
	public int display(String s,String s2);
}

public class LambdaExpression_4 {
	
//	public static void reverse(String str) {
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		System.out.println(sb);
//	}
//	public  void reverse(String str) {
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		System.out.println(sb);
	
	public LambdaExpression_4(String s) {
		System.out.println(s.toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyLamb ml = System.out::println;
//		MyLamb ml = LambdaExpression_4::reverse;
//		LambdaExpression_4 ld = new LambdaExpression_4();
//		MyLamb ml = ld::reverse;
//		MyLamb ml = LambdaExpression_4::new;
		MyLamb ml = String::compareTo;		
		System.out.println(ml.display("hello", "world"));

	}

}
