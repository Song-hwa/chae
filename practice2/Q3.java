package practice2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		//��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);

		//���� �Է¹ޱ�
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();

		//�ݿø� ��(���׿�����)
		int num2 = (num1 % 10 >= 5) ? num1/10*10+10 : num1/10*10;
//                       |                   |             |
//           (1���ڸ� ���ڰ� 5���� Ŭ ���)   (��:�ø� ����)   (����:���� ����)
		
		//��� ���
		System.out.println("�ݿø� �� : " + num2);
	
	}

}
