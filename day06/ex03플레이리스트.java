package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03�÷��̸���Ʈ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); // �뷡�� ����� ����Ʈ

		while (true) {
			System.out.print("[1]�뷡�߰� [2]�뷡���� [3]�뷡��ȸ [4]���� >> ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("========���� ������========");
				if (arr.size() == 0) {// �뷡�� ������
					System.out.println("��� ����� �����ϴ�.");
				} else {              // �뷡�� �߰��Ǿ��� ��
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i + 1) + "." + arr.get(i));
					}
				}

				System.out.println("=========================");
				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >> ");
				int num1 = sc.nextInt();

				if (num1 == 1) {//������ ��ġ�� �뷡 �߰�
					System.out.print("�߰��� �뷡 �Է�>>");
					String title = sc.next();
					arr.add(title);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
					System.out.println();
				}else {         //���ϴ� ��ġ�� �뷡 �߰�
					System.out.print("�߰��� �뷡 �Է�>>");
					String title = sc.next();
					System.out.print("�߰� �� ��ġ �Է� >> ");
					int num2 = sc.nextInt();
					arr.add(num2-1,title);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
					System.out.println();
				}
			} else if (num == 2) {//�뷡 ����
				System.out.println("========���� ������========");
				if(arr.size()==0) {//�������� ���� ��
					System.out.println("��� ����� �����ϴ�.");
					System.out.println("=========================");
					System.out.println();
				}else {            //��� ����� ������ ��
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i+1)+"."+arr.get(i));
					}
					System.out.println("=========================");
					System.out.println();
					System.out.print("[1]���û��� [2]��ü���� >>");
					int num3=sc.nextInt();
					if(num3==1) {  //�뷡 ���� ����
						System.out.print("������ �뷡 ����>> ");
						String del=sc.next();
						arr.remove(num3-1);
						System.out.println("�뷡�� �����Ǿ����ϴ�.");
					}else {        //��ü �뷡 ����
						arr.removeAll(arr);
						System.out.println("��ü �뷡�� �����Ǿ����ϴ�.");
						System.out.println();
					}
				}
			} else if (num == 3) {//��ȸ�ϱ�
				System.out.println("========���� ������========");
				if(arr.size()==0) {//�������� ���� ��
					System.out.println("��� ����� �����ϴ�.");
					System.out.println("=========================");
					System.out.println();
				}else {            //��� ����� ������ ��
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i+1)+"."+arr.get(i));
					}
					System.out.println("=========================");
					System.out.println();
				}
			} else if (num == 4) { //���α׷� ����
				System.out.println("���α׷��� ����Ǿ����ϴ�!");
				break;
			}
		}

	}

}
