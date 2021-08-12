package day02;

import java.util.Scanner;

public abstract class ex04삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //1.스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		
		//2.첫번째정수입력
		System.out.print("첫 번째정수를 입력하세요>>");
		
		//3.첫번째정수입력받기
		int num1 = sc.nextInt();
		
		//4.두번째정수 입력
		System.out.print("두 번째정수를 입력하세요>>");
		
		//5.두번째정수 입력받기
		int num2 = sc.nextInt();
		
		System.out.println(num1>num2?"두수의차는"+(num1-num2):"두수의차는"+(num2-num1));
		
		
	}

}
