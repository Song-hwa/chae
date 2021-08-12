package practice3;

import java.util.Scanner;

public class Qus3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int N = sc.nextInt();

		int[][] arr = new int[N][N];

		int data = 1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = data;
				data++;
			}
		}
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + "\t");
				}
			} else {
				for (int j = N - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}

}
