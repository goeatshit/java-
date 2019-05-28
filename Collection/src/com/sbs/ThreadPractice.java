package com.sbs;

public abstract class ThreadPractice {

	public static void main(String[] args) {
		Sheep1 h = new Sheep1();
		h.start();
		Sheep2 HR = new Sheep2();
		HR.run();
       
	

	}

}

