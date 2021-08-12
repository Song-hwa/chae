package practice;

import java.util.Scanner;

public class practice006 {

	public static void main(String[] args) {
		//스캐너 임포트
		Scanner sc = new Scanner(System.in);

		//정수1, 2 입력받기
		System.out.println("최대공약수&최소공배수 구하기");
		System.out.print("숫자1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 >> ");
		int num2 = sc.nextInt();

		//정수1&2중 큰 수, 최대공약수, 최소공배수 변수 지정
		int num3 = (num1 >= num2) ? num1 : num2;//정수 1,2중 큰 값
		int max = 0; //최대공약수
		int min = 0; //최소공배수

		//최대공약수 구하기(while문 이용)
		//정수 1, 2중 큰 수(i)에서 시작해서 i를 1씩 빼가며 반복, i가 2개의 정수의 약수가 되면 반복 종료하고
		//i를 최대공약수 변수(max)에 대입
		int i = num3;
		while (i >= 1) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
				break;
			}
			i--;
		}
		System.out.println("최대공약수 : " + max);

		//최소공배수 구하기(while문 이용)
		//공배수(i)를 1에서 시작해서 i를 1씩 더해가며 반복, 2개의 정수가 동시에 i의 약수가 되면 반복 종료하고
		//i를 최대공약수 변수(min)에 대입
		while (true) {
			if (i % num1 == 0 && i % num2 == 0) {
				min = i;
				break;
			}
			i++;
		}
		System.out.println("최소공배수 : " + min);

	}

}
