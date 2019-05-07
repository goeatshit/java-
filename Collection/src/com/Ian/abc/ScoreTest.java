package com.Ian.abc;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		try {
			System.out.print("Input Math Score：");
			Score math = new Score(k.nextLine());
			System.out.print("Input EnglishScore：");
			Score english = new Score(k.nextLine());
			int av = ((math.score + english.score) / 2);
			System.out.print(av);

		} catch (ScoreFormatException e) {

			System.out.print(e.getMessage());
		}

	}

}
