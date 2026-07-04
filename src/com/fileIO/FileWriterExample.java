package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;
/*
 * fw:write charectr data into file
 * we have to insert "\n" manually which is varied from system to system 
 * so we use bufferWriter in place of this */
public class FileWriterExample {
	public static void main(String args[]) throws IOException {
		FileWriter fw = new FileWriter("D:\\Demo\\abc123\\abc.text");
		fw.write(97);
		fw.write("bhigna");//abhigna
		fw.write('\n');
		char[] ch = { 'x', 'y', 'z' };
		fw.write(ch);//xyz
		fw.write('\n');
		fw.flush();
		fw.close();
	}
}