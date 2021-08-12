package day03;

import java.util.Random;
import java.util.Scanner;

public class ex04랜덤수 {

	public static void main(String[] args) {
		// 랜덤 수를 불러오기 위한 기능
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = rd.nextInt();
		int num2 = rd.nextInt(10)+1;
		
		System.out.println(num);
		
		//1~10 사이의 랜덤 수 추출!
		
		num = rd.nextInt(10)+1;
		System.out.println(num);
		System.out.println(num2);

	}

}
