package day03;

import java.util.Scanner;

public class ex03Login���α׷� {

	public static void main(String[] args) {
		// 1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 2. ���̵� �Է��ϼ��� ��� �� �Է¹ޱ�
			System.out.print("���̵� �Է��ϼ��� : ");
			String id = sc.next();

			// 3. ��й�ȣ�� �Է��ϼ��� ��� �� �Է¹ޱ�
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			String pw = sc.next();

			// 4. ���̵� Hello�̸鼭 ��й�ȣ 1234�� ° �α��� ���� �� ���α׷� ����
			if (id.equals("Hello") && pw.equals("1234")) {
				// �������� ��
				System.out.println("�α��� ����!");
				break;
			} else {
				// �������� ��
				// 1. �ٽ� �Ͻðڽ��ϱ�?(Y/N)
				System.out.println("���̵� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				System.out.print("�ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)");
				String answer = sc.next();

				// 2. Y > �ٽ� �Է�
				while (true) {
					if (answer.equals("Y")) {
						System.out.println("���̵�� ��й�ȣ�� Ȯ���� �ּ���.");
						break;
					} else if (answer.equals("N")) {
						// 3. N > ���α׷� ����
						System.out.println("���α׷� ����");
						break;
					} else {
						System.out.println("Y �Ǵ� N�� �Է����ּ���");
						System.out.print("�ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)");
						answer = sc.next();
					}
				}
				if (answer.equals("N")) {
					break;
				}

			}
			// 5. �� �� �ϳ��� Ʋ�� ��쿡�� ���̵�� ��й�ȣ�� Ȯ�����ּ��� Ŭ��!
		}

	}
}
