package javaPractise;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Absolute: "+Math.abs(-123));
		System.out.println("Absolute: "+StrictMath.abs(-123));
		System.out.println("CubeRoot of 9 is: "+Math.cbrt(9));
		System.out.println("Exact Decrement: "+Math.decrementExact(7));
//		System.out.println("Exact Decrement: "+Math.decrementExact(Integer.MIN_VALUE));
		int i = Integer.MIN_VALUE;
//		i--;
		System.out.println(--i);
		System.out.println("Exponent value in floating point rep. : "+Math.getExponent(123.45));
		
		System.out.println("Round Division: "+Math.floorDiv(50, 9));
		System.out.println("e power x: "+Math.exp(5));
		System.out.println("Log base 10: "+Math.log10(100));
		System.out.println("Maximum: "+Math.max(100, 50));
		System.out.println("Convert to radian: "+Math.toRadians(90));
		
		System.out.println("Random number: "+Math.random()*1000);
		System.out.println("Power: "+Math.pow(2, 3));
		
		System.out.println("Next Float Value: "+Math.nextAfter(12.5, 13));
		System.out.println("Next Float Value: "+Math.nextAfter(12.5, 11));

	}

}
