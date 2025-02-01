package javaPractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInputStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		FileOutputStream fos = new FileOutputStream("E:\\Java\\java_practise\\fos\\text2.txt");
//		String str = "Learn JAVA Programming";
		
		
		//using offset and length
//		byte [] b = str.getBytes();
//		fos.write(b, 6, str.length()-6);
		
		//Taking single byte we can do
//		byte [] b = str.getBytes();
//		for(byte x:b) {
//			fos.write(x);
//		}
		
		//Taking at a time all byte we can do
//		fos.write(str.getBytes());
//		fos.close();
		
		
		FileInputStream fis = new FileInputStream("E:\\Java\\java_practise\\fos\\text.txt");
		
		int x;
		do {
			x=fis.read();
			if(x!=-1) {
			System.out.print((char)x);
			}
		}while(x!=-1);
		
//		byte [] c =  new byte[fis.available()];
//		fis.read(c);
//		String s = new String(c);
//		System.out.println(s);

	}

}
