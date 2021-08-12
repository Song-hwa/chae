package day04;

import java.util.Scanner;

public class ex12배열수박2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] game = { '수', '박' };

		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i % 2 == 1 ? game[0] : game[1]);
		}
	}

}
