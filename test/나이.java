package test;

import java.util.Scanner;

public class 나이 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("나이입력:");
        int age = sc.nextInt();
        
        if(age>=61) {
        	System.out.println("노년");
        	
        }else if(age>=41){
        	System.out.println("중년");
        }else {
        	System.out.println("초년");
	}

}
}