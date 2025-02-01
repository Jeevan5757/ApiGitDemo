package javaPractise;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputOutputStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileInputStream fis = new FileInputStream("E:\\Java\\java_practise\\text3.txt");
//		BufferedInputStream bis = new BufferedInputStream(fis);
		FileReader fr = new FileReader("E:\\Java\\java_practise\\text3.txt");
		BufferedReader bis = new BufferedReader(fr);
		
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
//		System.out.println("file: "+fis.markSupported());
//		System.out.println("Buffer: "+bis.markSupported());
		
//		int x;
//		while((x =bis.read()) != -1) {
//			System.out.print((char)x);
		
		
//		}
		//bufered reader have new method from bufferinputstream
		System.out.println("String "+bis.readLine());

	}

}
