package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineCount {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		int lines = 0;

		while(br.readLine() != null){
		    lines++;
		}

		System.out.println(lines);
		br.close();

	}

}
