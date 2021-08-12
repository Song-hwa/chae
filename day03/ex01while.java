package day03;

import java.util.Scanner;

public class ex01while {

	public static void main(String[] args) {
		//1. 스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		
		int odd=0;
		int even=0;
		
		while (true) {
			//2. 숫자 입력이라는 출력문 작성
			System.out.print("숫자 입력 : ");
			//3. 숫자 입력받기
			int input = sc.nextInt();
			//4. -1을 입력했을 때 종료시키기
			if (input==-1) {
				System.out.println("종료되었습니다.");
				break;
			//5. -1이 아닌 경우 짝수와 홀수를 비교
			//6. 짝수와 홀수일 때 각각 1씩 증가하는 로직 작성
			}else if (input%2==1 ) {
				System.out.println("짝수 개수"+even);
				System.out.println("홀수 개수"+(++odd));
			}else {
				System.out.println("짝수 개수"+(++even));
				System.out.println("홀수 개수"+odd);
			}
		}
	}

}
