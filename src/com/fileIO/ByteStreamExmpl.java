package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//class->FileInputStream
//data:Binary
//Use: images,pdf
public class ByteStreamExmpl {

	
	//copying content from one file to another
	public static void main(String[] args) throws IOException {
		try {
		FileInputStream fis = new FileInputStream("input.jpg");
        FileOutputStream fos = new FileOutputStream("output.png");

        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }
        System.out.println("file copied successfully");
        System.out.println(System.getProperty("user.dir"));
        fis.close();
        fos.close();
		}catch(IOException e)  {
			System.out.println("error:"+e.getMessage());
			
		}

	}

}
