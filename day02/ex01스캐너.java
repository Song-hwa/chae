package day02;

import java.util.Scanner;

public class ex01스캐너 {

	public static void main(String[] args) {
		// 1. 스캐너 기능 불러오기 >> 입력을 해야하니까
		Scanner sc = new Scanner(System.in);
		// 2. Java 점수 입력이라는 출력문을 작성
		System.out.print("Java 점수 입력 : ");
		// 3. 사용자에게 점수를 입력받기
		int javaScore = sc.nextInt();
		// 4. Web점수 입력이라는 출력문 작성
		System.out.print("Web 점수 입력 : ");
		// 5. 사용자에게 점수 입력받기
		int webScore = sc.nextInt();
		// 6. Android점수 입력이라는 출력문 작성
		System.out.print("Android 점수 입력 : ");
		// 7. 사용자에게 점수 입력받기
		int androidScore = sc.nextInt();
		// 8. 합계 출력하기
		int totalScore = javaScore+webScore+androidScore;
		System.out.println("합계 : "+(totalScore));
		// 9. 평균 출력하기
		System.out.println("평균 : "+totalScore/3);
	}

}
