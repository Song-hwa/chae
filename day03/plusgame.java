package day03;

import java.util.Random;
import java.util.Scanner;

public class plusgame {

	public static void main(String[] args) {
		//1. �÷��� ������ ���� ������
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			
			//������ Ʋ���� ��� �ٽ� Ǯ�� Ʋ���������� ����
		int num1;
		int num2;
		Object wrong;
		if(wrong.equals("fail")) {
		}
		else {
			num1 = rd.nextInt(10)+1;
			num2 = rd.nextInt(10)+1;
		}
		
		
		//2. ������� ������ ȭ�鿡 ���
		System.out.println(num1+"+"+num2+"=");
		int result = sc.nextInt();
		
		//3. �Է��� ���� �������� �Ǵ��ϱ�
		if(num1+num2==result) {
		    wrong = "Success";
			System.out.println("Success");
		}else {
			wrong = "Fail";
			System.out.println("Fail");
			
		}
        //4.������ ��� �����ϴ��� �Ǵ��ϱ�
		
		
		System.out.print("����Ͻðڽ��ϱ�(y/n>>");
		String ans =sc.next();
		
		if(ans.equals("n")) {
			System.out.println("���α׷�����");
			break;
		}
		}
		
		//��ü���� ctrl+shift+f
	}

}
