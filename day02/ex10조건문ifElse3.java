package day02;

import java.util.Scanner;

public class ex10���ǹ�ifElse3 {

	public static void main(String[] args) {
		
		//1. ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		//2. �ݿø� ���� ���� ���ǹ� ����
		int result ;
		if (num%10>=5) {
			result = (num/10*10)+10;
		}else {
			result = num/10*10;
		}
		//3. �ݿø��� �� ���
		System.out.println("�ݿø� �� : "+result);
	}

}
