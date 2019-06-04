package com.sbs;

public class Gotoclass implements Runnable  {

	public void run() {
		try {
		System.out.println("go to Hanktom's class");
	    Thread.sleep(2000);
		System.out.println("Finish Hanktom's class");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
