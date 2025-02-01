package javaPractise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Students{
	int rollno;
	String name;
	String dept;
}


public class DataInputDataOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("E:\\Java\\java_practise\\StudentDetail2.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		
//		Students s = new Students();
//		s.rollno = 57;
//		s.name = "Jeevan";
//		s.dept = "Mechanical";
//		
//		dos.writeInt(s.rollno);
//		dos.writeUTF(s.name);
//		dos.writeUTF(s.dept);
//		
//		dos.close();
//	    fos.close();
//	    
	    FileInputStream fis = new FileInputStream("E:\\Java\\java_practise\\StudentDetail2.txt");
	    DataInputStream dis = new DataInputStream(fis);
	    Students s1 = new Students();
	    s1.rollno = dis.readInt();
	    s1.name = dis.readUTF();
	    s1.dept = dis.readUTF();
	    
	    System.out.println("RollNo: "+s1.rollno);
	    System.out.println("Name: "+s1.name);
	    System.out.println("Department: "+s1.dept);
	    dis.close();
	    fis.close();
	    
	    

	}

}
