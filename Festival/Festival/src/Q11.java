import java.util.Random;

public class Q11 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[8];
		int max = 0;
		int min = 100;
		
		System.out.print("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
			System.out.print(arr[i]+ " ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
	}

}
