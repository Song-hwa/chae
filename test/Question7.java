package test;

public class Question7 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 77; i++) {
			for (int j = 77; j >= 1; j--) {
				if (i + j == 78) {
					result += i * j;
				}
			}
		}
		System.out.println(result);

		// 또 다른 풀이

		int sum = 0;
		int cnt = 1;
		for (int i = 77; i >= 1; i--) {
			sum = sum + (i * cnt);
			cnt++;
		}

		System.out.println(sum);
	}

}
