package day02;

import java.util.Scanner;

public class ex08���ǹ�ifElse {

	public static void main(String[] args) {
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		//2. ������ �Է¹ޱ�
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//3. ¦���� ���� Ȧ���� ��� ���ǹ� ���� �� ����ϱ�
		if (num%2==0) {
			System.out.println(num+"��(��) ¦���Դϴ�");
		}else {
			System.out.println(num+"��(��) Ȧ���Դϴ�");
		}
		
		
	}

}
