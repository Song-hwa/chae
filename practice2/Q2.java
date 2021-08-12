package practice2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Çà °³¼ö : ");
		int h = sc.nextInt();
		
		for(int i = h; i>=1; i--) {
			for(int j = i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
