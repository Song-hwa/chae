package test;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 >> ");
		int input = sc.nextInt();

		int num1 = input / 10;
		int num2 = input % 10;

		System.out.println("10으로 나눈 몫 : " + num1);
		System.out.println("10으로 나눈 나머지 : " + num2);

	}

}
