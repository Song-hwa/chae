import java.util.Random;
import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while(cnt < 5) {
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);
			
			System.out.print(num1 + " + " + num2 + " = ");
			int num3 = sc.nextInt();
			
			if (num1 + num2 == num3) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("Fail...");
				cnt++;
			}
		}
		System.out.println("GAME OVER!");
	}

}
