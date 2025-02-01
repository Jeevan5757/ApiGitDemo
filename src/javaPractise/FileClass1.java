package javaPractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileClass1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("E:\\Java\\java_practise\\text3.txt");
//		System.out.println(f.isDirectory());
//		String list [] = f.list();
//		for(String x:list) {
//			System.out.println(x);
//		}
//		File list1 [] = f.listFiles();
//		for(File x:list1) {
//			System.out.println(x.getName()+" ");
//			System.out.println(x.getPath());
//			System.out.println(x.getAbsolutePath());
//			System.out.println(x.getParent());
//		}
		
//		f.setReadOnly(); // it will not able to open file since it is reAad only
//		FileOutputStream fos = new FileOutputStream("E:\\Java\\java_practise\\text3.txt");
		
//		f.setWritable(true); // it will be  able to open file since it is write only only
//		FileOutputStream fos = new FileOutputStream("E:\\Java\\java_practise\\text3.txt");
		
		System.out.println(f.lastModified());
		

	}

}
