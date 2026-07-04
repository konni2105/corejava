package com.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Merge2Files {

	public static void main(String[] args) throws IOException {
		 BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
	        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
	        BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));
	        
	        String line;
	        while((line = br1.readLine())!=null) {
	        	bw.write(line);
	        	bw.newLine();
	        }
	        while((line = br2.readLine())!=null) {
	        	bw.write(line);
	        	bw.newLine();
	        }
	        br1.close();
	        br2.close();
	        bw.close();
	}

}
