package day02;

import java.util.Scanner;

public class ex11조건문ifElse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요 : ");
		int wHour =sc.nextInt();
		
		int pay = 5000;
		double totalPay = 0;
				
		if (wHour>8) {
			totalPay=(pay*8)+((wHour-8)*pay*1.5);
		}else {
			totalPay=pay*wHour;
		}
		
		System.out.println("총 지급액은 "+(int)totalPay+"원 입니다.");
		
		
		
		
	}

}
