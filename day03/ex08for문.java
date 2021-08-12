package day03;

import java.util.Scanner;

public class ex08for문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수를 입력받아 1~입력받은 수 까지
		// 출력! ex) 7 -> 1~7까지

		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();

		for (int i = 0; i<input; i++) {
			System.out.print((i+1) + " ");
		}

	}

}
