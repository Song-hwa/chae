package day02;

import java.util.Scanner;

public class ex07���ǹ� {

	public static void main(String[] args) {
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		//2. intŸ���� ���� num �Է¹ޱ�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//3. num�� 3�� ����̸鼭 5�� ����� ���ǹ� �ۼ� �� "3�� 5�� ����Դϴ�"���
		if ((num%3==0) && (num%5==0)) {
			System.out.println("3�� 5�� ����Դϴ�.");
		}
		
	}

}
