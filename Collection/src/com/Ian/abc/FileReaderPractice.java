package com.Ian.abc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;

public class FileReaderPractice {

	public static void main(String[] args) {
//		int nn = Integer.parseInt("99");
//		try {
//			FileReader fir = new FileReader("abc.txt");
//		} catch (FileNotFoundException o) {
		// System.out.println("找不到文件");
		// o.printStackTrace();
	    File fe = new File("C:\\Users\\user\\eclipse-workspace");

	 if(fe.exists()) {
	  System.out.println(fe.getTotalSpace());
	  System.out.println(fe.getName()+"\t"+fe.getAbsolutePath()); 
	   /*   if(fe.exists()&&fe.isDirectory())
	   {
		File[] gg = fe.listFiles();
		for (File d : gg) {
			if (d.isFile()) {
				System.out.println(d.getName());

			}
			System.out.println(fe.mkdir());
			File aa = new File(fe, "Shit");
			System.out.println(aa.mkdir());
			System.out.println(fe.delete());
			System.out.println(aa.delete());
			
			
			

		}

	} */

	 }
	}
}
