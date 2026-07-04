package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*BR:used read the character data from file 
 * we can read data line by line in place of character by character 
 * directly,it can't  c/m with the file
it can c/m via some read  object
 * */
public class BufferReaderExample {
public static void main(String args[])throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("D:\\Demo\\file2.txt"));
	String line=br.readLine();
	while(line!=null) {
		System.out.print(line);
		line=br.readLine();
	}
  }
}
