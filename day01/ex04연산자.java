package day01;

import java.util.Scanner;

public class ex04������ {
//��ɾ ��ǻ�Ϳ��� �����ϴ� ��th�ǵ�!!!!!!!->main()
	public static void main(String[] args) {
	
	//����ڷκ��� �Է°� �ޱ�->keyboard
		//scanner class:�Է��������ִ� Ŭ����
	//1. scanner class �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		//java.util�� ����
		//1.import ���콺�� ����
		//2.import�����->ctrl+shift+'o'(�ڵ�����)
		
		
		//�Է��� ���� �ȳ����� ���
		
		System.out.print("����1 �Է�:");
		
		
		//Ű����� ���� ������ ������ �Է�
		//�������� �Է��ϱ� ���� ���->nextInt()
		int input1 = sc.nextInt();
	
		System.out.print("����2 �Է�:");
	    int input2 = sc.nextInt();
	    
	    System.out.println("�Էµ� ���� : "+input1+","+input2);
	    
	    
	    System.out.println("�� ���� ����:"+(input1+input2));
	    
	    //�� ���� ���� ���� ������ �� �ִ� ���� ����
	    int result = input1+input2;
	    System.out.println("�� ���� ����:"+result);
	    
	    
	    
	    
	    
	} // main �޼ҵ� ������ �κ�
	
}