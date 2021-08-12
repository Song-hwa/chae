package day06;

public class ex01오버로딩 {

	public static void main(String[] args) {
		// 오버 로딩
		// 하나의 기능으로 여러개의 데이터 처리를 해결 해둘 수 맀게 도와주는 기능
		
		print(1);
		print("문자3");
		print(1,3);
	}

	
	private static void print(int i, int j) {
		System.out.println("더하기 출력 " +(i+j));
	}


	private static void print(String string) {
		System.out.println("문자열 출력 " + string);
	}


	private static void print(int i) {
		System.out.println("숫자 하나 출력 " +i);
	}
}
