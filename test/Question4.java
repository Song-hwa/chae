package test;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("id : ");
			String id = sc.next();

			System.out.print("pw : ");
			String pw = sc.next();
			if (id.equals("dldmsql1214") && pw.equals("1214")) {
				System.out.println(id + "�� ȯ���մϴ�!");
				break;
			} else {
				System.out.println("�ٽ� Ȯ���ϼ���!");
				System.out.print("id�� pw�� �ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)");
				String answer = sc.next();
				if (answer.equals("Y")) {
					continue;
				}else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}
		}

	}

}
