package test;

import java.util.Scanner;

public class �α��� {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
            System.out.print("id:");
            String id = sc.next();
            System.out.print("pw:");
            String pw = sc.next();
            
            if(id.equals("dldmsql") &&pw.equals("1234") ) {
            
            	System.out.println("dldmsql�� ȯ���մϴ�!";)
            	break;
            }else {
            	System.out.println("�ٽ�Ȯ���ϼ���!";)
            }
	}

}
