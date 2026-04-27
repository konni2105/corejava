package com.alltasks;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TaskaFileIO {

	public static void main(String[] args) throws IOException, FileNotFoundException {
//		File f = new File("C:\\FileException\\Roy");
//		f.mkdir();
//		System.out.println("created folder!!");
		File f1 = new File("C:\\FileException\\Roy\\YR.txt");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		fw.write(100);
		fw.write('\n');
		fw.write("yashu");
		fw.write('\n');
		fw.write("Java is Simple !!");
		fw.write('\n');
		fw.write('P');
		fw.close();
		FileReader fr = new FileReader(f1);
		int a = fr.read();
		while (a != -1) {
			System.out.println((char) a);
			fr.read();
		}
		f1.delete();
		f1.exists();
		int c=0;
		String file[]=f1.list();
		for(String fils:file ) {
			c++;
			System.out.println(fils);//files list
		}
		System.out.println(c);//count of files
		
		System.out.println(f1.canExecute());//true
		f1.getCanonicalFile();//pathname
		System.out.println(f1.compareTo(f1));//true
		
		fr.close();
		 
	}

}
