package day02;

import java.util.Scanner;

public class ex16while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A �Է� >> ");
		int A =sc.nextInt();
		System.out.print("B �Է� >> ");
		int B =sc.nextInt();

		int result = A-B;
		
		while(A!=0 || B!=0) {
			result = A-B;
			System.out.println("��� >> "+result);
			System.out.print("A �Է� >> ");
			A =sc.nextInt();
			System.out.print("B �Է� >> ");
			B =sc.nextInt();
			if(A==0 && B==0) {
				break;
			}
		}System.out.println("����Ǿ����ϴ�.");
		
	}

}
