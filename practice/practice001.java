package practice;

import java.util.Scanner;

public class practice001 {

	public static void main(String[] args) {
		//스캐너 임포트
		Scanner sc = new Scanner(System.in);

		//현재 몸무게 입력받기
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		
		//목표 몸무게 입력받기
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();

		int week = 0; //n주차 변수 등록

		//do문을 이용한 반복시행
		do {
			//매주차별 감량 무게 입력받기
			System.out.print(++week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			now -= minus; //현재 몸무게에서 감량무게를 빼기
		} while (now >= goal); //현재 몸무게가 목표몸무게 이하가 될 때까지 반복
		System.out.println(now+"kg 달성!! 축하합니다!");
	}

}
