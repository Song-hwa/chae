package day02;

import java.util.Scanner;

public class IFELSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int input = sc.nextInt();
		
		if(input%2 == 0)
		{
            System.out.println(input+"은(는)짝수입니다.");
	}
		else {
            System.out.println(input+"은(는)홀수입니다.");
		}
		}
}
