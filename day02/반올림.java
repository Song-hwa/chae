package day02;

import java.util.Scanner;

public class �ݿø� {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("���ڸ� �Է��ϼ��� : ");
	      int input = sc.nextInt();
	      
	      int result = 0;
	      //�ݿø��� Ȯ���ϱ�
	      int n = input%10;
	      //�ݿø��� ���� ����
	      if(n>=5) {
	    	  
	    	  result = (input/10 + 1)*10;
	      }else {
	          result = input/10*10;
	      }
          System.out.println("�ݿø��� : "+result);

}
}