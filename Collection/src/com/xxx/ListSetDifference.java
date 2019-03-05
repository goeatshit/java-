package com.xxx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListSetDifference {

	public static void main(String[] args) {
		ArrayList<Integer> e = new ArrayList<Integer>();
		e.add(1010);
		e.add(1010);
		e.add(505050);
		System.out.println(e);
		
//		the difference between List and Set
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(100);
		s.add(100);
		System.out.println(s);
//     List 可以重复，Set不能重复。

		
	}
}
