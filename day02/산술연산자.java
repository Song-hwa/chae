package day02;

import java.util.Scanner;

public class 산술연산자 {

	public static void main(String[] args) {
	//1.스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
	//2. 초입력이라는 출력문 작성
		System.out.print("초입력>>");
	//3. 몇초인지 입력하기
		int totalSecond = sc.nextInt();
	//4. 몇시 몇분 몇초인지 출력하기	
        int hour = totalSecond/3600;
        int min = (totalSecond%3600)/60;
        int sec = (totalSecond%3600)%60;
        
        System.out.println(hour+"시"+min+"분"+sec+"초");
        		
	}

}
