package com.Ian.abc;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileOutputStremPractice {

	public static void main(String[] args) throws Exception {
		System.out.println("Hellow World");
		FileOutputStream fos = new FileOutputStream("cc.txt");
		FileWriter fw = new FileWriter("cc.txt"); 
		fw.write(0x51A0);
		fw.flush();
        fw.close();
		
		
		
		
	}

}
