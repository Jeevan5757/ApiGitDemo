package javaPractise;

@FunctionalInterface
interface MyLambda{
//	public void display(String s);
	public int add(int x, int y);
}

public class LambdaExpression_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyLambda m = new My();
//		m.display();
//		MyLambda m = (a,b)->{return a+b;};
//		System.out.println(m.add(30, 40));
		
		MyLambda m = (a,b)->a+b;
		int r = m.add(25, 27);
				System.out.println(r);
				

	}

}
