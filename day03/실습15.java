package day03;

import java.util.Scanner;

public class 실습15 {

	public static void main(String[] args) {
		System.out.println("===수박게임 start!===");
		char[] game = {'수','박'};
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("숫자를 입력해주시오>>");
		int num = sc.nextInt();
		
		for (int i =1; i<=num; i++) {
			 System.out.print(i%2==1? game[0]:game[1]);
			 
			 
	
		
	}

}
}
