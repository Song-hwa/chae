package test;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�:");
		int num = sc.nextInt();
		int sum = 0;

		while(num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("���ڸ��� ����" + sum);

	}

}
