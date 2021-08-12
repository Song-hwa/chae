package day02;

import java.util.Scanner;

public class ex10조건문ifElse3 {

	public static void main(String[] args) {
		
		//1. 정수 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		//2. 반올림 할지 말지 조건문 생성
		int result ;
		if (num%10>=5) {
			result = (num/10*10)+10;
		}else {
			result = num/10*10;
		}
		//3. 반올림한 수 출력
		System.out.println("반올림 수 : "+result);
	}

}
