package com.Ian.abc;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		try {
			System.out.print("请输入数学成绩:");
			Score math  =  new Score(k.nextLine());
			System.out.print("请输入英文成绩:");
			Score english = new Score(k.nextLine());
			int av =((math.score+english.score)/2);
			System.out.print(av);
			
		} catch (ScoreFormatException e) {
			
			System.out.print(e.getMessage());
		}
	
	

	}

}
