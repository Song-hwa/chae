package day03;

public class ex07for문 {

	public static void main(String[] args) {
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//1~100 3의 배수에 대한 누적합을 출력하기(한번만)
		int a = 0;
		for (int i = 1; i<=100; i++) {
			if (i%3==0) {
				a+=i;
			}
		}System.out.println(a);
	}

}
