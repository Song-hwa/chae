package test;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 >> ");
		int age = sc.nextInt();
		String age2 = "";

		if (age > 60) {
			age2 = "노년";
		} else if (age <= 60 && age > 40) {
			age2 = "중년";
		} else if (age <= 40 && age >= 0) {
			age2 = "초년";
		}

		System.out.println(age2 + "입니다.");

	}

}
