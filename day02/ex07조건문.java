package day02;

import java.util.Scanner;

public class ex07조건문 {

	public static void main(String[] args) {
		//1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		
		//2. int타입의 변수 num 입력받기
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		//3. num이 3의 배수이면서 5의 배수인 조건문 작성 및 "3과 5의 배수입니다"출력
		if ((num%3==0) && (num%5==0)) {
			System.out.println("3과 5의 배수입니다.");
		}
		
	}

}
