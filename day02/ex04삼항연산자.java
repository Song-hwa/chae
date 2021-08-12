package day02;

import java.util.Scanner;

public class ex04삼항연산자 {

	public static void main(String[] args) {
		//1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		
		//2. "첫 번째 정수 입력" 문장 불러오기
		System.out.print("첫 번째 정수 입력 : ");
		
		//3. 첫 번째 정수 입력
		int int1 = sc.nextInt();
		
		//4. "두 번째 정수 입력" 문장 불러오기
		System.out.print("두 번째 정수 입력 : ");
		
		//5. 두 번째 정수 입력
		int int2 = sc.nextInt();
		
		//6. 큰 수에서 작은 수를 빼는 삼항연산자 작성
		int s1 = int1>int2 ? int1-int2 : int2-int1;
		
		//7. 두 수의 차 출력
		System.out.println("두 수의 차 : "+s1);
	}

}
