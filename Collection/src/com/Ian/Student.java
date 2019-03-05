package com.Ian;

public class Student {
	String name;
	private int english;

	public Student(String name, int english) {
		this.name = name;
		this.english = english;

		
	}

	public void println() {
		System.out.println(name + "\t " + english);
	}

	public void setEnglish(int english) {
		if (english >= 0 && english <= 100) {
			this.english = english;
		} else {
			System.out.println("Neo Armstrong Cyclone Jet Armstrong Cannon ");

		}

	}
}
	
