package day02;

import java.util.Scanner;

public class IFELSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		int input = sc.nextInt();
		
		if(input%2 == 0)
		{
            System.out.println(input+"��(��)¦���Դϴ�.");
	}
		else {
            System.out.println(input+"��(��)Ȧ���Դϴ�.");
		}
		}
}
