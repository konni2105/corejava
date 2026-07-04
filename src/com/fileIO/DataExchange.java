package com.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataExchange {
//merge 2 file into 3rd file-> 3rd file data should be alternative
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("D:\\Demo\\file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("D:\\Demo\\file2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Demo\\mergeFile.txt"));

        String line1=br1.readLine();
         String line2 = br2.readLine();
       

        while((line1 != null)||(line2!=null)){
            
        	if(line1!=null) {
        	bw.write(line1);
            bw.newLine();
            line1 = br1.readLine(); 
        	}
        	if(line2!=null) {
            	bw.write(line2);
                bw.newLine();
                line2 = br2.readLine();
            	}
            	
        }

        br1.close();
        br2.close();
        bw.close();
        System.out.println("file merged successfully");
	}

}
