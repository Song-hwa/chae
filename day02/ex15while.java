package day02;

import java.util.Scanner;

public class ex15while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		while (num<10) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}
		System.out.println("����Ǿ����ϴ�.");
	}

}
