import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		int data = 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = data;
					data++;
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					arr[i][j] = data;
					data++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
