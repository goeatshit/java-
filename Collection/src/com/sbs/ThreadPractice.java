package com.sbs;

public  class ThreadPractice {

	public static void main(String[] args) {
		Sheep1 Sh = new Sheep1("Pussy");
		Sh.start();
		Sheep2 Sp = new Sheep2();
		Sp.run();

	}

}

