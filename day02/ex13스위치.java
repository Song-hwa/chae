package day02;

import java.util.Scanner;

public class ex13����ġ {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("���� �Է� : ");
		int grade = sc.nextInt();
		
		String result = "";
		//switch���� ���� �� ���� ������ ǥ���Ǿ�� �Ѵ�.
		//������ ���� ���ִ� ����� ������ ���� �ʴ�. -> break ��� �ʿ�!
		switch (grade/10) {
		//100~90
		case 10:
		case 9:
			result = "A";
			break;
		//90~80
		case 8:
			result = "B";
			break;
		//80~70
		case 7:
			result = "C";
			break;
		//�� ��� ������ �ش����� �ʴ� ����
		default:
			result = "D";
			break;
		}
		System.out.println(result+"�����Դϴ�.");
	}

}
