package javaPractise;

public class WrapClasses2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 12.5f;
		Float b = 12.5f;
		Float c = 12.5f/0;
		Float d = (float) Math.sqrt(-1);
		
		System.out.println(b.equals(a));
		System.out.println(b.isInfinite());
		System.out.println(c.isInfinite());
		System.out.println(c==Float.POSITIVE_INFINITY);
		System.out.println(d.isNaN());
		System.out.println(b !=Float.NaN);
		
		

	}

}
