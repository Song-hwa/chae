package day03;

import java.util.Random;
import java.util.Scanner;

public class ex04������ {

	public static void main(String[] args) {
		// ���� ���� �ҷ����� ���� ���
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = rd.nextInt();
		int num2 = rd.nextInt(10)+1;
		
		System.out.println(num);
		
		//1~10 ������ ���� �� ����!
		
		num = rd.nextInt(10)+1;
		System.out.println(num);
		System.out.println(num2);

	}

}
