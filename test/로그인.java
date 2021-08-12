package test;

import java.util.Scanner;

public class 로그인 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
            System.out.print("id:");
            String id = sc.next();
            System.out.print("pw:");
            String pw = sc.next();
            
            if(id.equals("dldmsql") &&pw.equals("1234") ) {
            
            	System.out.println("dldmsql님 환영합니다!";)
            	break;
            }else {
            	System.out.println("다시확인하세요!";)
            }
	}

}
