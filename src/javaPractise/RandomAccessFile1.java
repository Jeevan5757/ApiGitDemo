package javaPractise;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("E:\\Java\\java_practise\\text3.txt","rw");
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		rf.write('D');
		System.out.println((char)rf.read());
		rf.skipBytes(3); //it will skip 3 byte
		System.out.println((char)rf.read());
		rf.seek(3);
		System.out.println((char)rf.read());
		System.out.println((char)rf.getFilePointer());
		rf.seek(rf.getFilePointer()+2);
		System.out.println((char)rf.read());
	}

}
