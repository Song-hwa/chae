package day02;

import java.util.Scanner;

public class ex01��ĳ�� {

	public static void main(String[] args) {
		// 1. ��ĳ�� ��� �ҷ����� >> �Է��� �ؾ��ϴϱ�
		Scanner sc = new Scanner(System.in);
		// 2. Java ���� �Է��̶�� ��¹��� �ۼ�
		System.out.print("Java ���� �Է� : ");
		// 3. ����ڿ��� ������ �Է¹ޱ�
		int javaScore = sc.nextInt();
		// 4. Web���� �Է��̶�� ��¹� �ۼ�
		System.out.print("Web ���� �Է� : ");
		// 5. ����ڿ��� ���� �Է¹ޱ�
		int webScore = sc.nextInt();
		// 6. Android���� �Է��̶�� ��¹� �ۼ�
		System.out.print("Android ���� �Է� : ");
		// 7. ����ڿ��� ���� �Է¹ޱ�
		int androidScore = sc.nextInt();
		// 8. �հ� ����ϱ�
		int totalScore = javaScore+webScore+androidScore;
		System.out.println("�հ� : "+(totalScore));
		// 9. ��� ����ϱ�
		System.out.println("��� : "+totalScore/3);
	}

}
