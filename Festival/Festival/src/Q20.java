import java.util.ArrayList;
import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "�� ° ���� �Է�>>");
			int num = sc.nextInt();
			
			if(num % 3 == 0) {
				arr.add(num);
			}
		}
		System.out.print("3�� ��� : ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
	}

}
