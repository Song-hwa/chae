package day03;

import java.util.Scanner;

public class for_01 {

	public static void main(String[] args) {
		// ������ �Է¹޾� 1~�Է¹��� ������ ���
	    //ex)7>1~7
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int input = sc.nextInt();
		
		for (int i =1; i<=input; i++) {
			System.out.print(i+"");
		}
		

	}

}
