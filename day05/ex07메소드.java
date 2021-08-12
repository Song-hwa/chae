package day05;

public class ex07메소드 {

	public static void main(String[] args) {
//		getDivisor(10) : 함수에 입력되는 값의 약수를 구해주는 메소드
		// 10의 약수 : 1 2 5 10
		getDivisor(10);
	}

	public static void getDivisor(int num) {
		System.out.print(num+"의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
