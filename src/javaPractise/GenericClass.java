package javaPractise;

public class GenericClass<T> {
	@SuppressWarnings("unchecked")
	T data[] = (T[]) new Object[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object obj = new String("Hi");
//		obj = new Integer(10);
//		String str = (String) obj;
		
//		Object obj1[] = new Object[3];
//		obj1[0]="Hi";
//		obj1[1] = "Hello";
//		obj1[2] = new Integer(10);
//		String str1;
//		for(int i=0;i<3;i++) {
//			str = (String) obj1[i];
//			System.out.println(str);
//		}
		GenericClass<String> gd = new GenericClass();
		gd.data[0] = "hi";
		gd.data[2] = "Bye";
		//gd.data[1] = new Integer(10); //we can not use this 
		String str = gd.data[1];

	}

}
