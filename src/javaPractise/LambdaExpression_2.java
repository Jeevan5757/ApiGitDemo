package javaPractise;

@FunctionalInterface
interface MyLambdas{
	public void display();
}
class Demo{
	int temp =0;
	public void method1() {
		int count =0;
		MyLambdas m = ()->{
//			int count =0;
//			count++;
			System.out.println("Hi");
			System.out.println("Bye"+count+(++temp));
		};
		m.display();
//		count++;  -->it is not allowed
	}
	}
	
public class LambdaExpression_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
