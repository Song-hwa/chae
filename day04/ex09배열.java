package day04;

import java.util.Scanner;

public class ex09�迭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "�� ° ���� �Է�>>");
			arr[i] = sc.nextInt();
		}

		System.out.print("3�� ��� : ");
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 3 == 0) {
				System.out.print(arr[j] + " ");
			}
		}
	}

}
