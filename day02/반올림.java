package day02;

import java.util.Scanner;

public class 반올림 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("숫자를 입력하세요 : ");
	      int input = sc.nextInt();
	      
	      int result = 0;
	      //반올림수 확인하기
	      int n = input%10;
	      //반올림을 할지 말지
	      if(n>=5) {
	    	  
	    	  result = (input/10 + 1)*10;
	      }else {
	          result = input/10*10;
	      }
          System.out.println("반올림수 : "+result);

}
}