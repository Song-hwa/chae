package day03;

import java.util.Scanner;

public class ex01while {

	public static void main(String[] args) {
		//1. ��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		int odd=0;
		int even=0;
		
		while (true) {
			//2. ���� �Է��̶�� ��¹� �ۼ�
			System.out.print("���� �Է� : ");
			//3. ���� �Է¹ޱ�
			int input = sc.nextInt();
			//4. -1�� �Է����� �� �����Ű��
			if (input==-1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			//5. -1�� �ƴ� ��� ¦���� Ȧ���� ��
			//6. ¦���� Ȧ���� �� ���� 1�� �����ϴ� ���� �ۼ�
			}else if (input%2==1 ) {
				System.out.println("¦�� ����"+even);
				System.out.println("Ȧ�� ����"+(++odd));
			}else {
				System.out.println("¦�� ����"+(++even));
				System.out.println("Ȧ�� ����"+odd);
			}
		}
	}

}
