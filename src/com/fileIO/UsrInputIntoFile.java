package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsrInputIntoFile {

	public static void main(String[] args) throws IOException{
		
		Scanner s=new Scanner(System.in);
		FileWriter fw=new FileWriter("D:\\Demo\\test.txt",true);
		
		System.out.println("entr text:");
		String data=s.nextLine();
		
		fw.write(data);
		fw.close();
		s.close();
	}

}
