package day01;

import java.util.Scanner;

public class ex04연산자 {
//명령어를 컴퓨터에게 전달하는 메thㅗ드!!!!!!!->main()
	public static void main(String[] args) {
	
	//사용자로부터 입력값 받기->keyboard
		//scanner class:입력을도와주는 클래스
	//1. scanner class 불러오기
		Scanner sc = new Scanner(System.in);
		
		//java.util로 선택
		//1.import 마우스로 선택
		//2.import단축기->ctrl+shift+'o'(자동선택)
		
		
		//입력을 위한 안내문구 출력
		
		System.out.print("정수1 입력:");
		
		
		//키보드로 부터 정수형 데이터 입력
		//정수형을 입력하기 위한 기능->nextInt()
		int input1 = sc.nextInt();
	
		System.out.print("정수2 입력:");
	    int input2 = sc.nextInt();
	    
	    System.out.println("입력된 값은 : "+input1+","+input2);
	    
	    
	    System.out.println("두 수의 합은:"+(input1+input2));
	    
	    //두 개의 정수 합을 저장할 수 있는 변수 생성
	    int result = input1+input2;
	    System.out.println("두 수의 합은:"+result);
	    
	    
	    
	    
	    
	} // main 메소드 끝나는 부분
	
}