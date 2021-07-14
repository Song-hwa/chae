import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int num = sc.nextInt();
		
		System.out.println(dan + "단");
		for (int i = 1; i <= num; i++) {
			System.out.println(dan + "*" + num + "=" + i*dan);
		}
	}

}
