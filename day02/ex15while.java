package day02;

import java.util.Scanner;

public class ex15while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		while (num<10) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
	}

}
