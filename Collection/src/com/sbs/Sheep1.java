package com.sbs;

public class Sheep1 extends Thread {
	public Sheep1(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			StringBuilder sb = new StringBuilder();
			for (int k = 0; k < i; k++) {
				sb.append("");
			}
			System.out.println(getName() + sb.toString() + i);
		}
		try {
			sleep(100);

		} catch (InterruptedException I) {
			I.printStackTrace();
		}

	}

}

