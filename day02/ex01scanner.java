package day02;

import java.util.Scanner;

public class ex01scanner {

	public static void main(String[] args) {
		//1. ��ĳ�� ��� �ҷ�����>> �Է��� �ؾ��ϴϱ�
		Scanner sc = new Scanner(System.in);
		//2.java���� �Է��̶�� ��¹��� �ۼ�
		System.out.print("Java �����Է�");
		//3. ����ڿ��� ������ �Է¹ޱ�
		int input1 = sc.nextInt();
		//4.web���� �Է��̶�� ��¹� �ۼ�
		System.out.print("Web �����Է�");
		
		//5.����ڿ��� ������ �Է¹ޱ�
		int input2 = sc.nextInt();
	//6.�ȵ���̵� ���� �Է��̶�� ��¹� �ۼ�
		System.out.print("Android �����Է�");
		
		//7.����ڿ��� ������ �Է¹ޱ�
		int input3 = sc.nextInt();
		//8.�հ� ����ϱ�
		int sum = input1+input2+input3;
		System.out.println("�հ�:  "+sum);
		//9.�������ϱ�
		System.out.println("���:  "+sum/3);
		

	
		
		
		
		
		
	}

}
