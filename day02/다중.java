package day02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      
	      System.out.print("������ �Է��ϼ��� : ");
	      int grade = sc.nextInt();
	      String result = "";
	      
		
		  if (grade>=90) {
	           result = "A";
	      }else if(grade>=80) {
              result = "B";
              
	      }else if(grade>=70) {
	    	  result = "c";
	      }
	      System.out.println(result +"�����Դϴ�.");

}
}