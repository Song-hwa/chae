package day03;

import java.util.Scanner;

public class �ݺ��� {

	public static void main(String[] args) {
       
		//1.��ĳ�� ��� �ҷ�����
		
		Scanner sc = new Scanner(System.in);
		//�����Է��̶�� ��¹��ۼ�
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		//���ڸ� �Է¹ޱ�
		while(true) {
			System.out.print("�����Է�:  ");
			num = sc.nextInt();
			//-1�� �Է������� �����Ű��
			if(num==-1) {
				System.out.print("���α׷��� ����Ǿ����ϴ�.");
				break;}
			//-1�� �ƴѰ��>>¦���� Ȧ���� ��
			else if(num%2 ==0) {
				System.out.println("¦������:"+(++num2));
				System.out.println("Ȧ������:"+num1);
			}
			
			//¦���� Ȧ���϶� ���� 1�� �����ϴ� �����ۼ�
			else if(num%2 == 1) {
				System.out.println("¦������:"+(num2));
				System.out.println("Ȧ������ :"+(++num1));
//¦���� Ȧ���� ������ ���
				
				
	}

}
}
}