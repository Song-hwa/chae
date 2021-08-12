package day02;

import java.util.Scanner;

public class ex03삼항연산자 {

	public static void main(String[] args) {
		//1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		//2. 정수를 입력하시오 라는 출력문 작성
		System.out.print("정수를 입력하세요>>");
		//3.사용자에게 정수 입력받기
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.print(num+"은 짝수입니다.");
		}else {
           System.out.print(num+"은 홀수입니다.");
		}
}
}
