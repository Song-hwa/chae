package day04;

import java.util.Scanner;

public class ex12�迭����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] game = { '��', '��' };

		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i % 2 == 1 ? game[0] : game[1]);
		}
	}

}
