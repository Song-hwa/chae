import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "��° �� �Է� : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		System.out.println("���� ��");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < 5; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
