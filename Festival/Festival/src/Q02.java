import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int pay = 5000;
		double total;

		if (hour > 8) {
			total = 1.5 * pay * (hour - 8) + (pay * 8);
		} else {
			total = pay * hour;
		}
		System.out.println("총 임금은 " + (int) total + "원 입니다.");
	}

}
