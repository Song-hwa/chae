package day02;

import java.util.Scanner;

public class 시급 {

	public static void main(String[] args) {
	     
	
		  Scanner sc = new Scanner(System.in);
	 
	      System.out.print("일한시간을 입력하세요 : ");
	      int input = sc.nextInt();
	      
          int result = 0;
	
		  int time = 0;
		 if(time>8) {
			
			 result = time*5000;
			 
		  }else{ 
			  result = 40000+(int)((time-8)*5000*1.5);
		  }		
		  System.out.println("총 입금은"+ result +"입니다.");
	}

}
