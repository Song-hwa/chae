package day02;

import java.util.Scanner;

public class ex09���ǹ�ifElse2 {

	public static void main(String[] args) {
	      // 1. ������ �Է¹����� �ִ� ��� �����
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("������ �Է��ϼ��� : ");
	      int input = sc.nextInt();
	      
	      
	      // �������� : ��ü ����(main �޼ҵ�)���� ���ϼ� �ִ� ����
	      String result = "" ;
	      
	      // 2. ������ Ȧ������ ¦������ �Ǵ�
	      if(input%2 == 0) { // ¦�� �Ǵ�
	         
	         // Ư�� �������� ������ �� ������
	         // �� ���������� ����� �ȴ�.  -> ��������
	         result = "¦��";
	         
	      }else { // Ȧ��
	         result = "Ȧ��";
	      }
	      
	      // if-else���� ��� ���������� ����Ǵ� �κ�
	      System.out.println(input + "��(��) " + result + "�Դϴ�.");
	      
		
	}//main�޼ҵ尡 ������ ����

}
