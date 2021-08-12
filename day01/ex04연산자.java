package day01;

import java.util.Scanner;


public class ex04연산자 {
	// 명령어를 컴퓨터에게 전달(실행)하는 메소드 -> main()
	public static void main(String[] args) {
		
		//사용자로부터 입력값 받기 -> 키보드
		//scanner class : 입력을 도와주는 클래스
		
		// 1. Scanner class 불러오기
		Scanner sc = new Scanner(System.in);
		
		// java.util로 선택!!
		// 1. import 마우스로 선택
		// import 단축키 -> ctrl + shift + 'o' (자동선택)
		
		//입력을 위한 안내문구 출력
		System.out.print("정수1 입력 : ");
		
		
		//키보드로부터 정수형 데이터 입력
		//정수형을 입력하기 위한 기능 -> nextInt()
		int input1 = sc.nextInt();
		
		
		System.out.print("정수2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.println("입력된 값은 : " + input1 + ", "+input2);
		
		//두개의 정수를 더한 값 출력
		
		int result = input1 + input2;
		System.out.println("두수의 합은 : "+result);
		
		
	}

}
