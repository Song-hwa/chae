package test;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		int total = 0;

		for (int i = 1000; i >= 1; i /= 10) {
			total = (input / i) - ((input / (i * 10)) * 10) + total;
		}
		System.out.println("�� �ڸ��� �� : " + total);

		// �� �ٸ� Ǯ��
		System.out.print("���� �Է� : ");

		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("�� �ڸ��� ���� : " + sum + "�Դϴ�.");
	}

}
