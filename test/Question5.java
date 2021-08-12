package test;

public class Question5 {

	public static void main(String[] args) {
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i <= 100; i += 2) {
			total1 += i;
		}
		for (int i = -2; i >= -100; i -= 2) {
			total2 += i;
		}

		System.out.println("°á°ú : " + (total1 + total2));

	}

}
