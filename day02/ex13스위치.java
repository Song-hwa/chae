package day02;

import java.util.Scanner;

public class ex13스위치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("점수 입력 : ");
		int grade = sc.nextInt();
		
		String result = "";
		//switch문의 식은 꼭 실제 값으로 표현되어야 한다.
		//스스로 멈출 수있는 기능을 가지고 있지 않다. -> break 사용 필요!
		switch (grade/10) {
		//100~90
		case 10:
		case 9:
			result = "A";
			break;
		//90~80
		case 8:
			result = "B";
			break;
		//80~70
		case 7:
			result = "C";
			break;
		//그 어느 곳에도 해당하지 않는 값들
		default:
			result = "D";
			break;
		}
		System.out.println(result+"학점입니다.");
	}

}
