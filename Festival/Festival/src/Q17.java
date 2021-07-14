import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n ют╥б : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		int data = 1;
		int plus = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = data;
			data += plus;
			plus++;
			System.out.print(arr[i] + " ");
		}

	}

}
