package day03;

import java.util.Random;
import java.util.Scanner;

public class ex04������ {
	   public static void main(String[] args) {
	
	//�������� �ҷ����� ���� ���
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("==Plus Game==");
	String answer = "";
	
	
	//rd.nextInt(10)
	//0~9(10)���ڰ� ����!
	while (true) {
	int num = rd.nextInt(10)+1;
	int num2 = rd.nextInt(10)+1;
	System.out.print(num+"+"+num2+"=");
	int input = sc.nextInt();
	if (input == num+num2) {
		answer = "Success";
	}
	else {
		answer = "Fail";
	}
	//1~10������ ������ ����
	System.out.println(answer + "|��� �Ͻðڽ��ϱ�>>");
    String repeat = sc.next();
    if (repeat.equals("n")||repeat.equals("N")) {
    	break;
    }
	
	
	
}
}
}