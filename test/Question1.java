package test;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� >> ");
		int input = sc.nextInt();

		int num1 = input / 10;
		int num2 = input % 10;

		System.out.println("10���� ���� �� : " + num1);
		System.out.println("10���� ���� ������ : " + num2);

	}

}
