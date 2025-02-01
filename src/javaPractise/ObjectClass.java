package javaPractise;

class MyObject{
	public String toString() {
		return "My Object";
	}
	public int hashCode() {
		return 100;
	}
	public boolean equals(Object o) {
		return this.hashCode()==o.hashCode();
	}
}
class MyObject2 extends MyObject{
	
}

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob = new Object();
		Object o = new Object();
		Object o1 = ob;
		MyObject2 o2 = new MyObject2();
		
		MyObject o3 = new MyObject();
		MyObject o4 = new MyObject();
		System.out.println(o3.equals(o4));
		System.out.println(o2.toString());
		System.out.println(ob.equals(o));
		System.out.println(ob.equals(o1));
		System.out.println(ob.hashCode());

	}

}
