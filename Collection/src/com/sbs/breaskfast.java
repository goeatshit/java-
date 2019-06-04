package com.sbs;

public class breaskfast extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("eat breakfast");
			Thread.sleep(1000);
			System.out.println("Finish breakfast");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
