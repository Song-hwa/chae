package practice3;

import java.util.Scanner;

public class Qus4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		int data = 1;
		int plus = 1;

		for (int i = 0; i < n; i++) {
			arr[i] = data;
			data += plus;
			plus++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
