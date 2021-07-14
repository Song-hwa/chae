import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("총 금액 입력 : ");
		int total = sc.nextInt();
		System.out.println();

		System.out.println("잔돈 : " + total + "원");
		System.out.println("10000원 : " + total / 10000 + "개");
		System.out.println("5000원 : " + (total % 10000) / 5000 + "개");
		System.out.println("1000원 : " + (total % 5000) / 1000 + "개");
		System.out.println("500원 : " + (total % 1000) / 500 + "개");
		System.out.println("100원 : " + (total % 500) / 100 + "개");

	}

}
