package day02;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
//switch

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�:");
		int grade = sc.nextInt();
	
		
		// switch���� ���� �� ����!������ ǥ���� �Ǿ�� �Ѵ�.
		//������ ����� �ִ� ��� ������ �����ʾƼ�break����
		switch(grade/10) {
		case 10:
		case 9:	
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�.");
			break;
		case 7:
			System.out.println("c�����Դϴ�.");
			break;
		   default:
			   System.out.println("D�����Դϴ�.");
			   break;
		//80~90
		//70~80
		//  ~70
	}

}
}
