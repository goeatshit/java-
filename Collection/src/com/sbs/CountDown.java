package com.sbs;

import java.awt.image.AreaAveragingScaleFilter;

public class CountDown {

	public static void main(String[] args) {

		/*
		 * try { System.out.println("eat breakfast"); Thread.sleep(1000);
		 * System.out.println("Brushing my ass"); Thread.sleep(2000);
		 * System.out.println("go to Hanktom's class"); Thread.sleep(3000); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */

		breaskfast bf = new breaskfast();
		bf.start();

		Gotoclass gtc = new Gotoclass();
		Thread th = new Thread(gtc);

		th.start();

		try {
			bf.join();
		} catch (Exception u) {
			u.printStackTrace();
		}

		try {
			th.join();

		} catch (Exception j) {
			j.printStackTrace();

		}
		System.out.println("Main end");

	}
}
