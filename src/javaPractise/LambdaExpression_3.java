package javaPractise;

@FunctionalInterface
interface MyLambd{
	public void display();
}

class UseLambda{
	public void callLambda(MyLambd ml) {
		ml.display();
	}
}
class Demo1{
	public void method1() {
		UseLambda ul = new UseLambda();
		ul.callLambda(()->{System.out.println("Hello");});
	}
}

public class LambdaExpression_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		d.method1();

	}

}
