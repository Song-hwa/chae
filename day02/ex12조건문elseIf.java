package day02;

import java.util.Scanner;

public class ex12���ǹ�elseIf {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("������ �Է��ϼ��� : ");
	int grade = sc.nextInt();
	
	if (grade>=90 && grade<=100) {
		System.out.println("A�����Դϴ�.");
	}else if (grade>=80 && grade<90) {
		System.out.println("B�����Դϴ�.");
	}else if (grade>=70 && grade<80) {
		System.out.println("C�����Դϴ�.");
	}else if (grade<70) {
		System.out.println("�׾������!");
	}
		
	}

}
