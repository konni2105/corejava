package com.fileIO;

import java.io.File;
import java.io.IOException;

//create a file inside that folder

public class FileInsideFolder {

	public static void main(String[] args) throws IOException {

		// create diectory(foldername)
		File f = new File("abc123");
		f.mkdir();// Folder path: D:\pavitra\Vcube\Workspace\corejava\javaFun\abc123
		System.out.println(f.exists());
		System.out.println("Folder path: " + f.getAbsolutePath());

		// create file
		File f1 = new File(f, "abc.text");
		f1.createNewFile();// create file inside folder
		System.out.println(f1.exists());
		System.out.println("file path: " + f1.getAbsolutePath());// file path:
																	// D:\pavitra\Vcube\Workspace\corejava\javaFun\abc123\abc.text

		// File f1=new File("abc123","abc.text");
		// f1.createNewFile();

		// File f1=new File("D:\\Demo","abc.text");
		// f1.createNewFile();

		System.out.println("------------------------------------------");

		File f2 = new File("D:\\Demo\\abc123"); // ✅ absolute path
		f2.mkdir();
		System.out.println(f2.exists());
		System.out.println("Folder path: " + f2.getAbsolutePath());
		// create file
		File f3 = new File(f2, "abc.text");
		f3.createNewFile();// create file inside folder
		System.out.println(f3.exists());
		System.out.println("file path: " + f3.getAbsolutePath());
	}

}
