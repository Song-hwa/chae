package day04;

import java.util.Scanner;

public class ex11배열수박 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] game = { '수', '박' };

		System.out.print("숫자를 입력해주세요 : ");
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
