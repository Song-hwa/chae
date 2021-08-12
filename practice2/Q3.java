package practice2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		//스캐너 임포트
		Scanner sc = new Scanner(System.in);

		//정수 입력받기
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();

		//반올림 식(삼항연산자)
		int num2 = (num1 % 10 >= 5) ? num1/10*10+10 : num1/10*10;
//                       |                   |             |
//           (1의자리 숫자가 5보다 클 경우)   (참:올림 실행)   (거짓:내림 실행)
		
		//결과 출력
		System.out.println("반올림 수 : " + num2);
	
	}

}
