package day03;

import java.util.Scanner;

public class ex09for¹® {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		for (int i = 1;i<=9;i++) {
			for (int n = 1;n<=9;n++) {
				result=i*n;
				System.out.print(i+"*"+n+"="+result+"\t");
			}
			System.out.println();
		}
	}

}
