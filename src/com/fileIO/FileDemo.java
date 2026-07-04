package com.fileIO;

import java.io.File;
import java.io.IOException;

/*
 why?
      -file system allow java pgrm to intract with files stored in the os
      -Reading & Writing data to files 
      
      File
      FileReader
      FileWriter
      
      BufferReader
      BufferWriter
      
      InputStream
      OutStream
      PrintWriter
      
      👉 NIO = New Input Output (java.nio package)
      
 */


public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File f=new File("abc.text");//filename
		System.out.println(f.exists());//forfirsttime->false ; secondtime->true
		f.createNewFile();//create a physcial file
		System.out.println(f.exists());//true
	}

}

