package day02;

import java.util.Scanner;

public class ex05���׿����� {

	public static void main(String[] args) {
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		//2. "�󱸰��� ������ �Է��ϼ���"���� �ۼ�
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		
		//3. �󱸰��� ���� �Է�
		int besketBall = sc.nextInt();
		
		//4. �ʿ��� ������ ���� ���ϴ� ���׿����� �ۼ�
		int box = besketBall%5 == 0 ? besketBall/5 : (besketBall/5)+1;
		
		//5. "�ʿ��� ������ ��" ���� �Է�
		System.out.println("�ʿ��� ������ �� : "+ box);
		
	}

}
