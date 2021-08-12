package day03;

import java.util.Random;
import java.util.Scanner;

public class ex04랜덤수 {
	   public static void main(String[] args) {
	
	//랜덤수를 불러오기 위한 기능
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("==Plus Game==");
	String answer = "";
	
	
	//rd.nextInt(10)
	//0~9(10)숫자가 생성!
	while (true) {
	int num = rd.nextInt(10)+1;
	int num2 = rd.nextInt(10)+1;
	System.out.print(num+"+"+num2+"=");
	int input = sc.nextInt();
	if (input == num+num2) {
		answer = "Success";
	}
	else {
		answer = "Fail";
	}
	//1~10사이의 랜덤수 추출
	System.out.println(answer + "|계속 하시겠습니까>>");
    String repeat = sc.next();
    if (repeat.equals("n")||repeat.equals("N")) {
    	break;
    }
	
	
	
}
}
}