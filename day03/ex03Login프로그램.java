package day03;

import java.util.Scanner;

public class ex03Login프로그램 {

	public static void main(String[] args) {
		// 1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 2. 아이디 입력하세요 출력 후 입력받기
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();

			// 3. 비밀번호를 입력하세료 출력 후 입력받기
			System.out.print("비밀번호를 입력하세요 : ");
			String pw = sc.next();

			// 4. 아이디가 Hello이면서 비밀번호 1234일 째 로그인 성공 및 프로그램 종료
			if (id.equals("Hello") && pw.equals("1234")) {
				// 성공했을 때
				System.out.println("로그인 성공!");
				break;
			} else {
				// 실패했을 때
				// 1. 다시 하시겠습니까?(Y/N)
				System.out.println("아이디나 비밀번호가 틀렸습니다.");
				System.out.print("다시 입력하시겠습니까?(Y/N)");
				String answer = sc.next();

				// 2. Y > 다시 입력
				while (true) {
					if (answer.equals("Y")) {
						System.out.println("아이디와 비밀번호를 확인해 주세요.");
						break;
					} else if (answer.equals("N")) {
						// 3. N > 프로그램 종료
						System.out.println("프로그램 종료");
						break;
					} else {
						System.out.println("Y 또는 N을 입력해주세요");
						System.out.print("다시 입력하시겠습니까?(Y/N)");
						answer = sc.next();
					}
				}
				if (answer.equals("N")) {
					break;
				}

			}
			// 5. 둘 중 하나라도 틀린 경우에는 아이디와 비밀번호를 확인해주세요 클릭!
		}

	}
}
