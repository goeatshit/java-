package com.sbs;

public class Sheep2 implements Runnable  {
	
	



	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println( "Horse2:"+ i);
		}
		
		
	}
	

}


