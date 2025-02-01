package javaPractise;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Studentse{
	int rollno;
	String name;
	String dept;
	void Students(){
		
	}
}

public class ObjectInputOutputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("E:\\Java\\java_practise\\StudentDetail2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Studentse s = new Studentse();
		s.rollno = 57;
		s.name = "Jeevan";
		s.dept = "Mechanical";
		
		oos.writeObject(s);
		
		FileInputStream fis = new FileInputStream("E:\\Java\\java_practise\\StudentDetail2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	    Studentse s1;
	    s1 = (Studentse) ois.readObject();
	    
	    System.out.println("RollNo: "+s1.rollno);
	    System.out.println("Name: "+s1.name);
	    System.out.println("Department: "+s1.dept);

	}

}
