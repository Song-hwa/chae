import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		String str = sc.nextLine();

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (int i = 0; i < str.length(); i++) {
			int ascii = (int)Character.valueOf(str.charAt(i));
			
			if (ascii >= 97 && ascii <= 122) {
				arr[ascii - 97]++;
			} else if (ascii >= 65 && ascii <= 90) {
				arr[ascii - 65]++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((char)(i+97) + " : " + arr[i]);
		}
	}

}
