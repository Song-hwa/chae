package day02;

import java.util.Scanner;

public class ex14����ġ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		String season = "";
		
		switch (month/3) {
		case 4:
		case 0:
			season="�ܿ�";
			break;
		case 1:
			season="��";
			break;
		case 2:
			season="����";
			break;
		case 3:
			season="����";
			break;
		}
		System.out.println(month+"���� "+season+"�Դϴ�!");
		
		
	}

}
