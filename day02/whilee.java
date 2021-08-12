package day02;

import java.util.Scanner;

public class whilee {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
		int minus = 0;
		
        while (true) {
        System.out.print("A입력 :");
        num1 = sc.nextInt();
        
        System.out.print("B입력 :");
        num2 = sc.nextInt();
        
        minus = num1-num2;
      
       	System.out.println("결과>>"+minus);
        if (num1==0&&num2==0)  {
       	 System.out.println("프로그램종료 ");
       	 break;
       	 

	}

}
}
}