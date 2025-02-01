package javaPractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	private int rollno;
	private String name;
	private String dept;
	private float avg;
	private static int Data=10;
	public transient int t; //transient keyword means field should not be serialized
	Student1(){}
	public Student1(int r,String n,float a,String d) {
		rollno = r;
		name = n;
		avg = a;
		dept = d;
		Data = 500;
		t=500;
	}
	public String toString() {
		return "\nStudent Details\n"+
	           "\nRoll "+rollno+
	           "\nname "+name+
	           "\ndept "+dept+
	           "\navg "+avg+
	           "\nData "+Data+
	           "\nTransient "+t+"\n";
	}
}

public class SerializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("E:\\Java\\GitDemo\\text3.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		Student1 s = new Student1(57,"Jeevan",74.8f,"MECH");
//		oos.writeObject(s);
//		fos.close();
//		oos.close();
		
		FileInputStream fis = new FileInputStream("E:\\Java\\GitDemo\\text3.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student1 s = (Student1) ois.readObject();
		System.out.println(s);
		fis.close();
		ois.close();

	}

}
