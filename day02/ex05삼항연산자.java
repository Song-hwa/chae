package day02;

import java.util.Scanner;

public class ex05삼항연산자 {

	public static void main(String[] args) {
		//1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		
		//2. "농구공의 개수를 입력하세요"문장 작성
		System.out.print("농구공의 개수를 입력하세요 : ");
		
		//3. 농구공의 개수 입력
		int besketBall = sc.nextInt();
		
		//4. 필요한 상자의 수를 구하는 삼항연산자 작성
		int box = besketBall%5 == 0 ? besketBall/5 : (besketBall/5)+1;
		
		//5. "필요한 상자의 수" 문장 입력
		System.out.println("필요한 상자의 수 : "+ box);
		
	}

}
