package day03;

import java.util.Random;
import java.util.Scanner;

public class ex05랜덤수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("==Plus Game==");

		String yn;
		while (true) {
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;
			int num3 = num1 + num2;
			System.out.print(num1 + "+" + num2 + "=");
			int answer = sc.nextInt();
			if (num3 == answer) {
				System.out.println("Success");
			} else {
				while (num3 != answer) {
					System.out.println("Fail");
					System.out.print(num1 + "+" + num2 + "=");
					answer = sc.nextInt();
				}
				if (num3 == answer) {
				}
			}
			while (true) {
				System.out.print("게임을 계속하시겠습니까? (Y/N)");
				yn = sc.next();
				if (yn.equals("Y")) {
					
				} else if (yn.equals("N")) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("Y또는 N으로 입력하십시오");
					continue;
				}
				break;
			}if (yn.equals("N")) {
				break;
			}
		}

	}
}
