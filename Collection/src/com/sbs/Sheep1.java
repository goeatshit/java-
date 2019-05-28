package com.sbs;

public class Sheep1 extends Thread {
	public Sheep1(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(getName()+ i);

		}

	}

	
}
