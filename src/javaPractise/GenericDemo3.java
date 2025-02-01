package javaPractise;

class MyArrays<T> {
	@SuppressWarnings("unchecked")
	T A[] = (T[]) new Object[10];
	int length = 0;

	public void append(T v) {
		A[length++] = v;
	}

	public void display() {
		for (int i = 0; i < length; i++) {
			System.out.println(A[i]);
		}
	}
}
class MyArray2 extends MyArrays<String>{
	
}
class MyArray3<T> extends MyArrays<T>{
	
}

class A{}
class B extends A{}
class C extends A{}

//class MyArray4<T extends Number>{
//	@SuppressWarnings("unchecked")
//	T A[] = (T[]) new Object[10];
//	int length = 0;
//
//	public void append(T v) {
//		A[length++] = v;
//	}
//
//	public void display() {
//		for (int i = 0; i < length; i++) {
//			System.out.println(A[i]);
//		}
//	}
//	
//}

class MyArray4<T>{
	@SuppressWarnings("unchecked")
	T A[] = (T[]) new Object[10];
	int length = 0;

	public void append(T v) {
		A[length++] = v;
	}

	public void display() {
		for (int i = 0; i < length; i++) {
			System.out.println(A[i]);
		}
	}
	
}


public class GenericDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyArrays ma = new MyArrays(); //it will automatically take object class
//		MyArrays<Integer> ma = new MyArrays();
//		MyArray2 ma = new MyArray2();
//		MyArray3<String> ma = new MyArray3<>();
		MyArray4<Float> ma = new MyArray4<>();
//		MyArray4<A> ma = new MyArray4<>();
		ma.append(10.3f);
		ma.append(12.7f);
		ma.append(9.7f);
		ma.display();

	}

}
