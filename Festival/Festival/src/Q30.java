import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해 주세요 >> ");
		int num = sc.nextInt();

		String number = String.valueOf(num);

		int lenOfNum = number.length();

		int result = 0;

		for (int i = 0; i < lenOfNum; i++) {
			if (String.valueOf(number.charAt(i)).equals("1")) {
				result += 2;
			} else if (String.valueOf(number.charAt(i)).equals("7")) {
				result += 3;
			} else if (String.valueOf(number.charAt(i)).equals("4")) {
				result += 4;
			} else if (String.valueOf(number.charAt(i)).equals("2")) {
				result += 5;
			} else if (String.valueOf(number.charAt(i)).equals("3")) {
				result += 5;
			} else if (String.valueOf(number.charAt(i)).equals("5")) {
				result += 5;
			} else if (String.valueOf(number.charAt(i)).equals("0")) {
				result += 6;
			} else if (String.valueOf(number.charAt(i)).equals("6")) {
				result += 6;
			} else if (String.valueOf(number.charAt(i)).equals("9")) {
				result += 6;
			} else if (String.valueOf(number.charAt(i)).equals("8")) {
				result += 7;
			}
		}

		System.out.println("대시('-')의 총 합 >> " + result);

	}

}
