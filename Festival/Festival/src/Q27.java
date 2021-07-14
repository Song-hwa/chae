import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		System.out.println("정렬 후");
		
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
