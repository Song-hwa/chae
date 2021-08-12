package day03;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
       
		//로그인 기능 만들기
		
		//1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		while(true) {
        // 2. 아이디를 입력하세요 출력 후 입력받기
		System.out.print("아이디:");
		String id = sc.next();
//3, 비밀번호를 입력하세요 출력 후 입력받기
		System.out.print("비밀번호 입력:");
		String pw = sc.next();
		
		//4. 아이디가 hello이면서 비밀번호가 1234일때
		if(id.equals("hello") && pw.equals("1234")) {
			//성공했을때
			System.out.println("로그인 성공!");
			break;
		}else {

			
			
			//실패했을때
			//1.다시 하시겠습니까?다시물어보기(y/n)
			System.out.print("다시하시겠습니까?(Y/N)>>");
			String re = sc.next();
			
			
			if(re.equals("n")||re.equals("N")) {
			   System.out.println("종료합니다");
			   break;
			}else if(re.equals("y")||re.equals("Y")) {
				continue;
			}
				//2.네,y 입력, 아니요 n입력
			//3.만약에 사용자가n을 입력한다면 프로그램종료
		}
		}
		//로그인 성공!>>프로그램종료
		
		//5. 둘 중 하나라도틀릴때 아이디 비밀 확인 출력
		//다시 반복문
	}

}
