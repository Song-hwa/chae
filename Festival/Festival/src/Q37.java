import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ют╥б : ");
		int n = sc.nextInt();
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println(result);
	}

}
