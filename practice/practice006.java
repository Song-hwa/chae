package practice;

import java.util.Scanner;

public class practice006 {

	public static void main(String[] args) {
		//��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);

		//����1, 2 �Է¹ޱ�
		System.out.println("�ִ�����&�ּҰ���� ���ϱ�");
		System.out.print("����1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� >> ");
		int num2 = sc.nextInt();

		//����1&2�� ū ��, �ִ�����, �ּҰ���� ���� ����
		int num3 = (num1 >= num2) ? num1 : num2;//���� 1,2�� ū ��
		int max = 0; //�ִ�����
		int min = 0; //�ּҰ����

		//�ִ����� ���ϱ�(while�� �̿�)
		//���� 1, 2�� ū ��(i)���� �����ؼ� i�� 1�� ������ �ݺ�, i�� 2���� ������ ����� �Ǹ� �ݺ� �����ϰ�
		//i�� �ִ����� ����(max)�� ����
		int i = num3;
		while (i >= 1) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
				break;
			}
			i--;
		}
		System.out.println("�ִ����� : " + max);

		//�ּҰ���� ���ϱ�(while�� �̿�)
		//�����(i)�� 1���� �����ؼ� i�� 1�� ���ذ��� �ݺ�, 2���� ������ ���ÿ� i�� ����� �Ǹ� �ݺ� �����ϰ�
		//i�� �ִ����� ����(min)�� ����
		while (true) {
			if (i % num1 == 0 && i % num2 == 0) {
				min = i;
				break;
			}
			i++;
		}
		System.out.println("�ּҰ���� : " + min);

	}

}
