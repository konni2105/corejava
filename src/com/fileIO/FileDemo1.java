package com.fileIO;

import java.io.File;
//file class
public class FileDemo1 {

	public static void main(String[] args) {
		
		//java fileobj is used to repsnt both files and directories
		
		File f=new File("abc123");//directoryname/foldernm
		System.out.println(f.exists());//false
		f.mkdir();//create directory
		System.out.println(f.exists());//true
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
	}

}
