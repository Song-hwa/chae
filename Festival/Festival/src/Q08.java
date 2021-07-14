import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A 입력 >> ");
			int A = sc.nextInt();
			System.out.print("B 입력 >> ");
			int B = sc.nextInt();

			if (A == 0 && B == 0) {
				break;
			}
			System.out.println("결과 >> " + (A - B));
		}
	}

}
