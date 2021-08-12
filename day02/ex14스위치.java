package day02;

import java.util.Scanner;

public class ex14스위치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		String season = "";
		
		switch (month/3) {
		case 4:
		case 0:
			season="겨울";
			break;
		case 1:
			season="봄";
			break;
		case 2:
			season="여름";
			break;
		case 3:
			season="가을";
			break;
		}
		System.out.println(month+"월은 "+season+"입니다!");
		
		
	}

}
