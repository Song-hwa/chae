package day02;

import java.util.Scanner;

public class ifelse2 {
	
	public static void main(String[] args) {

	      // 1. 정수를 입력받을수 있는 기능 만들기
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("숫자를 입력하세요 : ");
	      int input = sc.nextInt();
	      
	      
	      // 전역변수 : 전체 영역(main 메소드)에서 쓰일수 있는 변수
	      String result = "" ;
	      
	      // 2. 정수가 홀수인지 짝수인지 판단
	      if(input%2 == 0) { // 짝수 판단
	         
	         // 특정 영역에서 선언이 된 변수는
	         // 그 영역에서만 사용이 된다.  -> 지역변수
	         result = "짝수";
	         
	      }else { // 홀수
	         result = "홀수";
	      }
	      
	      // if-else문을 벗어나 공통적으로 실행되는 부분
	      System.out.println(input + "는 " + result + "입니다.");
	      
	      
	   }  // main메소드가 끝나는 영역

	}

	}

}
