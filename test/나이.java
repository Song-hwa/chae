package test;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�����Է�:");
        int age = sc.nextInt();
        
        if(age>=61) {
        	System.out.println("���");
        	
        }else if(age>=41){
        	System.out.println("�߳�");
        }else {
        	System.out.println("�ʳ�");
	}

}
}