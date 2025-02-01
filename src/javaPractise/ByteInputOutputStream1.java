package javaPractise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteInputOutputStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		byte b[] = {'a','b','c','d','e','f','g','h','i'};
//		ByteArrayInputStream bis = new ByteArrayInputStream(b);
//		
//		
//		String str = new String(bis.readAllBytes());
//		System.out.println(str);
//		System.out.println(bis.markSupported());
		
		
//		int x;
//		while((x=bis.read())!=-1) {
//			System.out.print((char)x);
//		}
//		bis.close();
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		
//		byte [] c =bos.toByteArray();
//		for(int x:c) {
//			System.out.println((char)x);
//		}
		
		bos.writeTo(new FileOutputStream("E:\\Java\\java_practise\\bytetext.txt"));
		bos.close();

	}

}
