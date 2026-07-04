package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchWord {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader("D:\\Demo\\test.txt"));
	        String word = "Java";
	        String line;
	        int lineNum=0;
	        
	        while((line = br.readLine()) != null) {
	        	lineNum++;
	        	if(line.contains(word)) {
	        		System.out.println("found line"+lineNum);
	        	}
	        }
	}

}
