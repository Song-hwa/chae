package day03;

import java.util.Scanner;

public class 실습10 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			 
	      System.out.print("1번째입력>> ");
	      int num1 = sc.nextInt();
	      System.out.print("2번째입력>> ");
	      int num2 = sc.nextInt();
	      System.out.print("3번째입력>> ");
	      int num3 = sc.nextInt();
	      System.out.print("4번째입력>> ");
	      int num4 = sc.nextInt();
	      System.out.print("5번째입력>> ");
	      int num5 = sc.nextInt();
	      System.out.print("6번째입력>> ");
	      int num6 = sc.nextInt();
	      System.out.print("7번째입력>> ");
	      int num7 = sc.nextInt();
	      System.out.print("8번째입력>> ");
	      int num8 = sc.nextInt();
	      System.out.print("9번째입력>> ");
	      int num9 = sc.nextInt();
	      System.out.print("10번째입력>> ");
	      int num10 = sc.nextInt();
	      
	      int[] arr = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
	      System.out.print("3의 배수 :");
	      for(int i =0; i<arr.length; i++) {
	    	  if(arr[i]%3 == 0) {
	    	  System.out.print(arr[i]+"    ");
	      

	}

}
	}
}
