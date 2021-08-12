package day03;

import java.util.Random;
import java.util.Scanner;

public class randomgame {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	      Random rd = new Random();
	      
	      while(true) {
	         
	         int num1 = rd.nextInt(10)+1;
	         int num2 = rd.nextInt(10)+1;
	         int num_sum = num1+num2;
	         String answer_user = "";
	         System.out.print(num1 + "+" + num2 + "=" );
	         int  result = sc.nextInt();
	         
	         if(num_sum ==  result) {
	            System.out.println("Success");
	            System.out.print("계속하시겠습니까?(Y/N):");
	            answer_user = sc.next();
	            
	            if(answer_user.equals("Y")){
	               continue;
	            }else {
	               System.out.println("프로그램 종료");
	               break;
	            }
	            
	            
	         }else {
	            System.out.println("Fail");
	            System.out.print("계속하시겠습니까?(Y/N):");
	            answer_user = sc.next();
	            
	            
	            if(answer_user.equals("Y")){
	               continue;
	            }else {
	               System.out.println("프로그램 종료");
	               break;
	            }
	            
	            
	         }
	         
	      }
	      
	}
}



