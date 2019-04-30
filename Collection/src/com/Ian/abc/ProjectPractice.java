package com.Ian.abc;

import java.util.Scanner;

public class ProjectPractice {

	public static void main(String[] args) {
		int av = 0;
		Scanner c = new Scanner(System.in);
		try {
			System.out.print("请输入数学成绩:");
			int math = Integer.parseInt(c.nextLine());
			System.out.print("请输入英文成绩:");
			int english = Integer.parseInt(c.nextLine());
			if (math >= 0 && math <= 100 && english >= 0 && english <= 100) {
				av = (math + english) / 2;
				System.out.print("平均:" + av);
			} else if (math < 0 || math > 100 || english < 0 || english > 100
					|| math < 0 && math > 100 && english < 0 && english > 100) {
				System.out.println("你需要尊重，友愛，包起來!");
			}
		} catch (Exception w) {
			System.out.println("数值资料错误");
//			w.printStackTrace();

		}   

	}

}

