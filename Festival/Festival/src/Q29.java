import java.util.ArrayList;
import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.print("N �Է� >> ");
		int n = sc.nextInt();
		System.out.print("X �Է� >> ");
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+1 + "��° ���� �Է� : ");
			int num = sc.nextInt();
			if(num < x) {
				arr.add(num);
			}
		}
		System.out.print("��� >> ");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}

}
