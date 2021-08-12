package day02;

import java.util.Scanner;

public class ex08조건문ifElse {

	public static void main(String[] args) {
		//1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		
		//2. 정수를 입력받기
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//3. 짝수일 경우와 홀수일 경우 조건문 생성 및 출력하기
		if (num%2==0) {
			System.out.println(num+"는(은) 짝수입니다");
		}else {
			System.out.println(num+"는(은) 홀수입니다");
		}
		
		
	}

}
