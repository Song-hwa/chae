package day02;

import java.util.Scanner;

public class SWITCH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월입력:");
		int month = sc.nextInt();
		String season = "";
		
		
		// switch문의 식은 꼭 실제!값으로 표현이 되어야 한다.
		//스스로 멈출수 있는 기능 가지고 있지않아서break쓰기
		switch(month/3) {
		case(0):
		case(4):	
			season = "겨울";
		    break;
		case(1):
			season = "봄";
		    break;
		case(2):
			season = "여름";
	        break;
		case(3):
			season = "가을";
            break;
		}   
		System.out.println(month + "월은"+season+"입니다.");


	}

}
