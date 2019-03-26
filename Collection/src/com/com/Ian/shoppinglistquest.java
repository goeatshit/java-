package com.com.Ian;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class shoppinglistquest {

	public static void main(String[] args) {
		List<Item> t = new ArrayList<>();
		String name = "";
		while (!name.equals("q")) {
			Scanner s = new Scanner(System.in);
			System.out.print("PLEASE ENTER ITEM NAME:");
			name = s.nextLine();
			System.out.print("PLEASE ENTER QUANTITY:");
			int q = Integer.parseInt(s.nextLine());
			t.add(new Item(name, q));
			// list all
			for (Item item : t) {
				System.out.println(item.name + "\t" + item.q);
			}

		}

	}

}
