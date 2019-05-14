package com.Ian.abc;
import java.io.*;

public class JavaExam {

	public static void main(String[] args)  {

		
	    try {	      
	            FileWriter fw = new FileWriter("cc.txt");
	            PrintWriter o = new PrintWriter(fw);
	            o.write("JAVA ¤BÖö");
	            o.flush();
	            o.close();     
	        }catch(FileNotFoundException y){
	            y.printStackTrace();
	        }catch(IOException q) {
	        	q.printStackTrace();	        	

	}

	}

}
