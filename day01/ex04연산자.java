package day01;

import java.util.Scanner;


public class ex04������ {
	// ��ɾ ��ǻ�Ϳ��� ����(����)�ϴ� �޼ҵ� -> main()
	public static void main(String[] args) {
		
		//����ڷκ��� �Է°� �ޱ� -> Ű����
		//scanner class : �Է��� �����ִ� Ŭ����
		
		// 1. Scanner class �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// java.util�� ����!!
		// 1. import ���콺�� ����
		// import ����Ű -> ctrl + shift + 'o' (�ڵ�����)
		
		//�Է��� ���� �ȳ����� ���
		System.out.print("����1 �Է� : ");
		
		
		//Ű����κ��� ������ ������ �Է�
		//�������� �Է��ϱ� ���� ��� -> nextInt()
		int input1 = sc.nextInt();
		
		
		System.out.print("����2 �Է� : ");
		int input2 = sc.nextInt();
		
		System.out.println("�Էµ� ���� : " + input1 + ", "+input2);
		
		//�ΰ��� ������ ���� �� ���
		
		int result = input1 + input2;
		System.out.println("�μ��� ���� : "+result);
		
		
	}

}
