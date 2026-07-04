package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadPrintRevContent {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        StringBuilder sb = new StringBuilder();
        String line;

        while((line = br.readLine()) != null){
            sb.append(line).append("\n");
        }

        System.out.println(sb.reverse());
        br.close();

	}

}
