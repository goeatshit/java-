package com.Ian.abc;

	import java.io.*;

	public class FileReader {
	    public static void main(String[] args) throws FileNotFoundException  {
	        FileInputStream r = new FileInputStream("result.txt");
	        try{
	        r = new  FileInputStream("result.txt");
	        int n = r.read();
	        while(n!=-1){
	            System.out.print((char)n);
	            n = r.read();
	        }
	    } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }catch(IOException y){
	            y.printStackTrace();
	        }finally{
	            if(r!=null){
	                try {
	                    r.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }

	            }
	        }

	        }
	    }


	


