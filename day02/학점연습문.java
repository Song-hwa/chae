package day02;

import java.util.Scanner;

public class 학점연습문 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
         while (true) {
         System.out.print("정수입력 :");
         int num = sc.nextInt();
         
         if (num<10) {
        	 System.out.println(num);
         }
         else {
        	 System.out.println("프로그램종료 ");
        	 break;
        	 
         }
         }

	}
}
