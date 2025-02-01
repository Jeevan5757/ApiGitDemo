package javaPractise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student{
	int rollno;
	String name;
	String dept;
}
public class PrintStreamClass1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("E:\\Java\\java_practise\\StudentDetail.txt");
//		PrintStream ps = new PrintStream(fos);
//		
//		Student s = new Student();
//		s.rollno = 57;
//		s.name = "Jeevan";
//		s.dept = "Mechanical";
//		
//		ps.println(s.rollno);
//		ps.println(s.name);
//		ps.println(s.dept);
//		
//		ps.close();
//	    fos.close();
	    
	    
	    FileInputStream fis = new FileInputStream("E:\\Java\\java_practise\\StudentDetail.txt");
	    BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		Student s1 = new Student();
		s1.rollno = Integer.parseInt(br.readLine());
		s1.name = br.readLine();
		s1.dept = br.readLine();
		
		System.out.println("RollNo: "+s1.rollno);
		System.out.println("Name: "+s1.name);
		System.out.println("dept: "+s1.dept);
	    
	    

	}

}
