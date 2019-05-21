package com.Ian.abc;

import java.io.*;

public class Tester {

	public static void main(String[] args) {
		int u = 0;
		try {
			FileInputStream i = new FileInputStream("data.txt");
			Reader r = new InputStreamReader(i);

			while (u != -1) {
				System.out.print((char) u);
				u = r.read();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException y) {
			y.printStackTrace();
		}

	}
}