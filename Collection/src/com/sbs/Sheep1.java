package com.sbs;

public class Sheep1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(getname()+ i);

		}

	}

	
}
