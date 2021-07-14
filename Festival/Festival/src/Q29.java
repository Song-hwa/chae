import java.util.ArrayList;
import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			int num = sc.nextInt();
			if(num < x) {
				arr.add(num);
			}
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}

}
