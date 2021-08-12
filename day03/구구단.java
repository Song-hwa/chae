package day03;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단입력:");
	    int dan = sc.nextInt();
	 // 곱의 수를 증가 시킬 수 있는 for문 작성
	    for(int i=1; i<10;i++) {
       //단을 한줄에서 하나씩 증가시키기 위한 for문 작성
		System.out.println(dan+"*"+i+"="+dan*i);
	    }

	}

}
