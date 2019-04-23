package com.Ian.abc;

import java.util.Scanner;

public class ProjectPractice {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int av = 0;
        try {
		System.out.print("请输入数学成绩:");
		int math = Integer.parseInt(c.nextLine());
		System.out.print("请输入英文成绩:");
		int english = Integer.parseInt(c.nextLine());
	    av = (math+english)/2;
        }catch(Exception w) {
        	System.out.println("数值资料错误");
        	
        	
        }
		System.out.print("平均:"+av);
		
		

	}

	
}
