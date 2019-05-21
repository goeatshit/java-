package com.sbs;

import java.io.*;

public class BufferedTest {

	public static void main(String[] args) {
		try {
			FileInputStream m = new FileInputStream("data.txt");
			InputStreamReader s = new InputStreamReader(m);
			BufferedReader b = new BufferedReader(s);
			String l = b.readLine();
			while (l != null) {
				System.out.println(l);
				String[] t = l.split(",");
				if(t.length == 2) {
					System.out.println(t[0]+ "/"+t[1]);
					int w = Integer.parseInt(t[1]);
				}
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException o) {

			o.printStackTrace();
		}

	}

}
