package day04;

import java.util.Scanner;

public class ex08배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 입력>>");
			arr[i] = sc.nextInt();
		}
		System.out.print("입력된 점수: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
