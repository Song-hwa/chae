package day02;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
//switch

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력:");
		int grade = sc.nextInt();
	
		
		// switch문의 식은 꼭 실제!값으로 표현이 되어야 한다.
		//스스로 멈출수 있는 기능 가지고 있지않아서break쓰기
		switch(grade/10) {
		case 10:
		case 9:	
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("c학점입니다.");
			break;
		   default:
			   System.out.println("D학점입니다.");
			   break;
		//80~90
		//70~80
		//  ~70
	}

}
}
