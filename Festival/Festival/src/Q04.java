import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�� �ݾ� �Է� : ");
		int total = sc.nextInt();
		System.out.println();

		System.out.println("�ܵ� : " + total + "��");
		System.out.println("10000�� : " + total / 10000 + "��");
		System.out.println("5000�� : " + (total % 10000) / 5000 + "��");
		System.out.println("1000�� : " + (total % 5000) / 1000 + "��");
		System.out.println("500�� : " + (total % 1000) / 500 + "��");
		System.out.println("100�� : " + (total % 500) / 100 + "��");

	}

}
