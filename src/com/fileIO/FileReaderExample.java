package com.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*  FR: read character data from file
 * we can read the data character by character thats BufferReader is introduced
 * */
public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\Demo\\file2.txt");
		int i=fr.read();//read single characters
		while(i!=-1) {//if charectr not avaiabl then retrn -1
			System.out.print((char)i);
			i=fr.read();
		}
		
		System.out.println("---------------------------------");
		File f=new File("D:\\Demo\\file2.txt");
		char[] ch=new char[(int) f.length()];
		FileReader fr1=new FileReader(f);
		fr1.read(ch);
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		
	}

}
