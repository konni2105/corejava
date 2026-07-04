package com.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* BW:used to write character data into file 
directly,it can't  c/m with the file
it can c/m via some writer object


newLine()
 .*/
public class BufferWriterExample {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Demo\\abc123\\abc.text"));
		
		bw.write(97);//a
		bw.newLine();
		
		char[] ch = { 'x', 'y', 'z' };
		bw.write(ch);//xyz
		bw.newLine();
		bw.write("vcube");
		bw.write("java full stack");
		bw.flush();
		bw.close();
	}
}
