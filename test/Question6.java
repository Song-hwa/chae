package test;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int total = 0;

		for (int i = 1000; i >= 1; i /= 10) {
			total = (input / i) - ((input / (i * 10)) * 10) + total;
		}
		System.out.println("각 자리수 합 : " + total);

		// 또 다른 풀이
		System.out.print("정수 입력 : ");

		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("각 자리의 합은 : " + sum + "입니다.");
	}

}
