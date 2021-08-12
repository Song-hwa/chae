package day01;

public class ex05치환 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 6;
		
		//자바에서는 치환을 하기 위해 새로운 변수가 필요하다!
		
		// int temp;     // 변수 선언만 된 결과
		// int temp = 0; // 변수 선언과 초기값 설정
		
		int temp;
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);

	}

}
