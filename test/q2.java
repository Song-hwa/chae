package test;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("���ѽð�:");
		int hour = sc.nextInt();
		int over = 0;
		int (hour>8){
			over = hour-8;
			int result = (7500*over) + 40000;
	
			System.out.print("�� �ӱ���:"+result+"���Դϴ�.");
		}else {
			System.out.print("�� �ӱ���:"+(hour*5000)+"���Դϴ�.");
		}

	}

}
