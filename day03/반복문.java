package day03;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {
       
		//1.스캐너 기능 불러오기
		
		Scanner sc = new Scanner(System.in);
		//숫자입력이라는 출력문작성
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		//숫자를 입력받기
		while(true) {
			System.out.print("숫자입력:  ");
			num = sc.nextInt();
			//-1을 입력했을때 종료시키기
			if(num==-1) {
				System.out.print("프로그램이 종료되었습니다.");
				break;}
			//-1이 아닌경우>>짝수와 홀수를 비교
			else if(num%2 ==0) {
				System.out.println("짝수개수:"+(++num2));
				System.out.println("홀수개수:"+num1);
			}
			
			//짝수와 홀수일때 각각 1씩 증가하는 로직작성
			else if(num%2 == 1) {
				System.out.println("짝수개수:"+(num2));
				System.out.println("홀수개수 :"+(++num1));
//짝수와 홀수의 개수를 출력
				
				
	}

}
}
}