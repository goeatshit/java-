package com.xxx;

import java.util.Random;
import java.util.Scanner;

public class ExceptionErrorTest {

	public static void main(String[] args) {
		Random r = new Random();
		int D = 0;
		int bonus = r.nextInt(1000000000);
		Scanner s = new Scanner(System.in);
		System.out.print("你这儿他妈有多少人想偷钱？");
		String number = s.nextLine();
		try {
			int n = Integer.parseInt(number);
			if(n>=0) {
			D = bonus / n;
			System.out.println("妈的再分=" + "$" + D);
			}else if(n<0) {
				System.out.println("你奶奶的腿！");
			}
		} catch (Exception p) {
			System.out.println("数值资料错误");
		}
//		catch(ArithmeticException p) {
//			System.out.println("数值运算错误");
//		}
//		catch(NumberFormatException p) {
//			System.out.println("数值格式错误");
//			
//		}
	
	
		
	}
}

