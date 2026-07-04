package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//PW: to writer character data to file
//We can write any primitive data directly to file 
public class PrintWriterExample {

	
	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("D:\\Demo\\file1.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);//ASCII d
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("durga");
		pw.close();
	}

}
