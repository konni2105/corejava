package com.fileIO;

import java.io.File;
//display files and their count in particular path
public class FileCount {

	public static void main(String[] args) {
	/*	File f=new File("D:\\Demo");
		int count=0;
		String[] s=f.list();// display filenames
		for(String s1:s) {
			System.out.println(s1);
			count++;
			
		}
		System.out.println("total numder:"+count); */
		
		System.out.println("----------------------------------");
		int count=0;
		File f=new File("c:\\Users\\hp");
		String[] s=f.list();
		for(String s1:s) {
			File f1=new File(f,s1);
			if(f1.isFile()) {   //isDirectory
				count++;
				System.out.println(f1);
			}
			
		}
		System.out.println("total files:"+count);
		
		System.out.println("====================================");
	/*	import java.io.*;

		public class WordCount {
		    public static void main(String[] args) throws IOException {
		        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		        int count = 0;
		        String line;

		        while((line = br.readLine()) != null){
		            String[] words = line.split(" ");
		            count += words.length;
		        }

		        System.out.println("Words: " + count);
		        br.close();
		    }
		}
		*/		
	}

}
