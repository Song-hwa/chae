package test;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int hour = sc.nextInt();
		double total = 0;
		int pay = 5000;

		if (hour > 8) {
			total = (pay * (hour - 8) * 1.5) + (pay * 8);
		} else {
			total = pay * hour;
		}

		System.out.println("�� �ӱ��� " + (int) total + "�� �Դϴ�.");

	}

}
