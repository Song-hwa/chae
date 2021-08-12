package test;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("일한시간:");
		int hour = sc.nextInt();
		int over = 0;
		int (hour>8){
			over = hour-8;
			int result = (7500*over) + 40000;
	
			System.out.print("총 임금은:"+result+"원입니다.");
		}else {
			System.out.print("총 임금은:"+(hour*5000)+"원입니다.");
		}

	}

}
