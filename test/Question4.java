package test;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("id : ");
			String id = sc.next();

			System.out.print("pw : ");
			String pw = sc.next();
			if (id.equals("dldmsql1214") && pw.equals("1214")) {
				System.out.println(id + "님 환영합니다!");
				break;
			} else {
				System.out.println("다시 확인하세요!");
				System.out.print("id와 pw를 다시 입력하시겠습니까?(Y/N)");
				String answer = sc.next();
				if (answer.equals("Y")) {
					continue;
				}else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
		}

	}

}
