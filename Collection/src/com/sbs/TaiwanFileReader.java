package com.sbs;

import java.io.*;
import java.util.*;

public class TaiwanFileReader {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> areas = new ArrayList<>();
		ArrayList<String> postCodes = new ArrayList<>();

		try {
			BufferedReader inn = new BufferedReader(new FileReader("datta.txt"));
			String Line = inn.readLine();
			String lastCity = "";
			while (Line != null) {
			//	System.out.println(Line);
				String[] t = Line.split(",");
				if (!t[0].equals(lastCity)) {
					lastCity = t[0];
					cities.add(lastCity);
				}
				areas.add(t[1]);
//				postCodes.add(t[2]);
				Line = inn.readLine();
			}
		} catch (Exception w) {
			w.printStackTrace();
		}
		System.out.println(cities);

	}

}
