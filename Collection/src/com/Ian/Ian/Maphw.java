package com.Ian.Ian;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Maphw {

	public static void main(String[] args) {
		Random a = new Random();
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < 9999; i++) {
			int s = a.nextInt(1000);
			Integer times = m.get(s);
			if (times == null) {
				m.put(s, 105);
			} else {
				m.put(s, 505);

			}
			System.out.println(s);

		}

	}

}
