package practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class Qus6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (n != 0) {
			arr.add(n % 2);
			n /= 2;
		}
		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.print(arr.get(i));
		}
	}

}
