package javaPractise;

class Data<T>{
	private T obj;
	public void setData(T v) {
		obj = v;
	}
	public T getData() {
		return obj;
	}
}

class MyArray<T>{
	@SuppressWarnings("unchecked")
	T A[] =(T[]) new Object[10];
	int length =0;
	
	public void append(T v) {
		A[length++]=v;
	}
	public void display() {
		for(int i=0;i<length;i++) {
		System.out.println(A[i]);
		}
	}
}


public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer> d = new Data<>();
				d.setData(10);
		System.out.println(d.getData());
		
		MyArray <Integer> ma = new MyArray<>();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.display();

	}

}
