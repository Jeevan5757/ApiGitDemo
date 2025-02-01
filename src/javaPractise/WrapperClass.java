package javaPractise;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("removal")
		Integer i = new Integer(10);
//		Integer a = new Integer.valueOf(10);
		Integer b = 10;
		
		Byte d = Byte.valueOf("15");
		
		byte bb = 15;
		Byte e = Byte.valueOf(bb);
		
		Short f = Short.valueOf("123");
		
		Float g = 12.3f;
		Float h = Float.valueOf("123.5");
		
		Double j = Double.valueOf(123.456);
		
		Character k = Character.valueOf('A');
		Boolean l = Boolean.valueOf("true");
		
		float x = h.floatValue();
		float y =h;
		
		int m =10;
		Integer n =m;
		int p = n; //auto unboxing
		
		int m1 =15;
		Integer m2 = m1;
		Integer m3 = 15;
		System.out.println(m2.equals(m3));
		Integer m4 = Integer.valueOf("123");
		Integer m5 = Integer.valueOf("11111111",2);
		Integer m6 = Integer.valueOf("A7",16);
		Integer m7 = Integer.decode("0xA7");
		System.out.println(m7);
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString(40));
		System.out.println(Integer.sum(5, 7));
		System.out.println(Integer.signum(-5));
		
		

	}

}
