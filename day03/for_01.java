package day03;

import java.util.Scanner;

public class for_01 {

	public static void main(String[] args) {
		// 정수를 입력받아 1~입력받은 수까지 출력
	    //ex)7>1~7
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int input = sc.nextInt();
		
		for (int i =1; i<=input; i++) {
			System.out.print(i+"");
		}
		

	}

}
