package com.sbs;

public class Wizard extends Thread {
	public void Explosion() {
		System.out.println("Explosion!");
		try {
			sleep(1000);

		} catch (Exception r) {
			r.printStackTrace();
		}
		System.out.print("Explosion~");
	}

	public void run() {
		Explosion();
	}

	public static void main(String[] args) {
		Wizard s1 = new Wizard();
		Wizard s2 = new Wizard();
		s1.start();
		s2.start();
	}
}