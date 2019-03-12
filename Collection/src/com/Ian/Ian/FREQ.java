package com.Ian.Ian;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class FREQ {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<20;i++) {
			l.add(0);
		}
		for (int i = 0; i < 10000000; i++) {
			int s =r.nextInt(20); 
			Integer freq=l.get(s);
			l.set(s, freq+1);
			

			}
		
			 for(int i=0;i<l.size();i++) {
		        	System.out.println(i+":"+l.get(i));

		}
      
        
	}

}
