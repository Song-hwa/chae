package day02;

import java.util.Scanner;

public class ex11���ǹ�ifElse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int wHour =sc.nextInt();
		
		int pay = 5000;
		double totalPay = 0;
				
		if (wHour>8) {
			totalPay=(pay*8)+((wHour-8)*pay*1.5);
		}else {
			totalPay=pay*wHour;
		}
		
		System.out.println("�� ���޾��� "+(int)totalPay+"�� �Դϴ�.");
		
		
		
		
	}

}
