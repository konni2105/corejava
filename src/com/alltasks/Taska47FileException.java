package com.alltasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Taska47FileException {

	public static void main(String[] args) throws FileNotFoundException,IOException, InterruptedException     {
     File f = new File("C:\\FileException\\Yashu.txt");
     //Unhandled exception type IOException
     f.createNewFile();
     //Unhandled exception type FileNotFoundException
     //try with resource
     try(FileReader fr=new FileReader(f)){
     int a=fr.read();
     while(a!=-1)
     {
    	 System.out.print((char) a);
    	 //Unhandled exception type InterruptedException
    	 Thread.sleep(100);
    	  a=fr.read();
     }
	}
	}
	 
}
