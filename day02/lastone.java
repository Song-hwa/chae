package day02;

import java.util.Scanner;

public class lastone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		//2.농구공의 갯수를 입력해주세요라는 출력문 작성
		System.out.print("농구공의 개수를 입력하세요>>");
		//3.농구공의 개수를 입력받기
		int input1 = sc.nextInt();
		//4.필요한 상자의 개수를 출력

		
		System.out.println("필요한 상자의수:  "+input1/5);
	}

}
