package day02;

import java.util.Scanner;

public class ex12조건문elseIf {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("점수를 입력하세요 : ");
	int grade = sc.nextInt();
	
	if (grade>=90 && grade<=100) {
		System.out.println("A학점입니다.");
	}else if (grade>=80 && grade<90) {
		System.out.println("B학점입니다.");
	}else if (grade>=70 && grade<80) {
		System.out.println("C학점입니다.");
	}else if (grade<70) {
		System.out.println("죽어버리렴!");
	}
		
	}

}
