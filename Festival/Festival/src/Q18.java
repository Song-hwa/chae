import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int result = 0; 
		
		for (int i = 10000000; i >= 1; i/=10) {
			
			result += (num/i);
			num %= i;
		}
		System.out.println("���� " + result + "�Դϴ�.");
	}

}
