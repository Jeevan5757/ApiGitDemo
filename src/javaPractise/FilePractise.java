package javaPractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FilePractise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String file_input_path = "E:\\Java\\java_practise\\source.txt";
//		String file_output_path = "E:\\Java\\java_practise\\source_output.txt";
//		FileInputStream fis = new FileInputStream(file_input_path);
//		byte [] b = new byte[fis.available()];
//		fis.read(b);
//		String s = new String(b);
//		String character_lowercase = s.toLowerCase();
//		System.out.println(character_lowercase);
//		FileOutputStream fos = new FileOutputStream(file_output_path);
//		fos.write(character_lowercase.getBytes());
//		fos.close();
		
		//reading 2 different file 
		FileInputStream fis1 = new FileInputStream("E:\\Java\\java_practise\\source_output.txt");
		FileInputStream fis2 = new FileInputStream("E:\\Java\\java_practise\\source.txt");
		FileOutputStream fos = new FileOutputStream("E:\\Java\\java_practise\\destination.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		int b;
		while((b=sis.read())!=-1) {
			fos.write(b);
		}
		sis.close();
		fis1.close();
		fis2.close();
		fos.close();

	}

}
