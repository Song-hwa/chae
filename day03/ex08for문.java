package day03;

import java.util.Scanner;

public class ex08for�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ������ �Է¹޾� 1~�Է¹��� �� ����
		// ���! ex) 7 -> 1~7����

		System.out.print("������ �Է��ϼ��� : ");
		int input = sc.nextInt();

		for (int i = 0; i<input; i++) {
			System.out.print((i+1) + " ");
		}

	}

}
