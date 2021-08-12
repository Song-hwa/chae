package day02;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2.java점수 입력이라는 출력문을 작성
		System.out.print("Java 점수입력");
		//3. 사용자에게 점수를 입력받기
		int input1 = sc.nextInt();
		//4.web점수 입력이라는 출력문 작성
		System.out.print("Web 점수입력");
		
		//5.사용자에게 점수를 입력받기
		int input2 = sc.nextInt();
	//6.안드로이드 점수 입력이라는 출력문 작성
		System.out.print("Android 점수입력");
		
		//7.사용자에게 점수를 입력받기
		int input3 = sc.nextInt();
		//8.합계 출력하기
		int sum = input1+input2+input3;
		System.out.println("합계:  "+sum);
		//9.평균출력하기
		System.out.println("평균:  "+sum/3);
	}

}
