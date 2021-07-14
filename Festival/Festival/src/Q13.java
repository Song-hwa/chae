import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int[][] arr = new int [n][n];
		int data = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = data;
				data++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
