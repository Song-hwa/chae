package practice;

import java.util.Scanner;

public class practice001 {

	public static void main(String[] args) {
		//��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);

		//���� ������ �Է¹ޱ�
		System.out.print("��������� : ");
		int now = sc.nextInt();
		
		//��ǥ ������ �Է¹ޱ�
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();

		int week = 0; //n���� ���� ���

		//do���� �̿��� �ݺ�����
		do {
			//�������� ���� ���� �Է¹ޱ�
			System.out.print(++week + "���� ���� ������ : ");
			int minus = sc.nextInt();
			now -= minus; //���� �����Կ��� �������Ը� ����
		} while (now >= goal); //���� �����԰� ��ǥ������ ���ϰ� �� ������ �ݺ�
		System.out.println(now+"kg �޼�!! �����մϴ�!");
	}

}
