package day02;

import java.util.Scanner;

public abstract class ex04���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //1.��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		//2.ù��°�����Է�
		System.out.print("ù ��°������ �Է��ϼ���>>");
		
		//3.ù��°�����Է¹ޱ�
		int num1 = sc.nextInt();
		
		//4.�ι�°���� �Է�
		System.out.print("�� ��°������ �Է��ϼ���>>");
		
		//5.�ι�°���� �Է¹ޱ�
		int num2 = sc.nextInt();
		
		System.out.println(num1>num2?"�μ�������"+(num1-num2):"�μ�������"+(num2-num1));
		
		
	}

}
