package day02;

import java.util.Scanner;

public class ex04���׿����� {

	public static void main(String[] args) {
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		//2. "ù ��° ���� �Է�" ���� �ҷ�����
		System.out.print("ù ��° ���� �Է� : ");
		
		//3. ù ��° ���� �Է�
		int int1 = sc.nextInt();
		
		//4. "�� ��° ���� �Է�" ���� �ҷ�����
		System.out.print("�� ��° ���� �Է� : ");
		
		//5. �� ��° ���� �Է�
		int int2 = sc.nextInt();
		
		//6. ū ������ ���� ���� ���� ���׿����� �ۼ�
		int s1 = int1>int2 ? int1-int2 : int2-int1;
		
		//7. �� ���� �� ���
		System.out.println("�� ���� �� : "+s1);
	}

}
