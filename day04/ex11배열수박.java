package day04;

import java.util.Scanner;

public class ex11�迭���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] game = { '��', '��' };

		System.out.print("���ڸ� �Է����ּ��� : ");
		int input = sc.nextInt();
		int num = input / 2;
		
		if (input % 2 == 0) {
			while (num != 0) {
				for (int i = 0; i < game.length; i++) {
					System.out.print(game[i]);
				}
				num -= 1;
			}
		} else if (input % 2 == 1) {
			while (num != 0) {
				for (int i = 0; i < game.length; i++) {
					System.out.print(game[i]);
				}
				num -= 1;
			}
			System.out.println(game[0]);

		}
	}
}
