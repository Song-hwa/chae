package day02;

import java.util.Scanner;

public class ex16while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 입력 >> ");
		int A =sc.nextInt();
		System.out.print("B 입력 >> ");
		int B =sc.nextInt();

		int result = A-B;
		
		while(A!=0 || B!=0) {
			result = A-B;
			System.out.println("결과 >> "+result);
			System.out.print("A 입력 >> ");
			A =sc.nextInt();
			System.out.print("B 입력 >> ");
			B =sc.nextInt();
			if(A==0 && B==0) {
				break;
			}
		}System.out.println("종료되었습니다.");
		
	}

}
