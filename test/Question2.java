package test;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한 시간을 입력하세요 : ");
		int hour = sc.nextInt();
		double total = 0;
		int pay = 5000;

		if (hour > 8) {
			total = (pay * (hour - 8) * 1.5) + (pay * 8);
		} else {
			total = pay * hour;
		}

		System.out.println("총 임금은 " + (int) total + "원 입니다.");

	}

}
