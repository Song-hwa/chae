package day03;

import java.util.Random;
import java.util.Scanner;

public class plusgame {

	public static void main(String[] args) {
		//1. 플러스 게임을 위한 랜덤수
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			
			//문제를 틀렸을 경우 다시 풀때 틀린문제부터 출제
		int num1;
		int num2;
		Object wrong;
		if(wrong.equals("fail")) {
		}
		else {
			num1 = rd.nextInt(10)+1;
			num2 = rd.nextInt(10)+1;
		}
		
		
		//2. 만들어진 랜덤수 화면에 출력
		System.out.println(num1+"+"+num2+"=");
		int result = sc.nextInt();
		
		//3. 입력한 값이 정답인지 판단하기
		if(num1+num2==result) {
		    wrong = "Success";
			System.out.println("Success");
		}else {
			wrong = "Fail";
			System.out.println("Fail");
			
		}
        //4.게임을 계속 진행하는지 판단하기
		
		
		System.out.print("계속하시겠습니까(y/n>>");
		String ans =sc.next();
		
		if(ans.equals("n")) {
			System.out.println("프로그램종료");
			break;
		}
		}
		
		//전체정렬 ctrl+shift+f
	}

}
