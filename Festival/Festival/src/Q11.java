import java.util.Random;

public class Q11 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[8];
		int max = 0;
		int min = 100;
		
		System.out.print("배열에 있는 모든 값 : ");
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
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
