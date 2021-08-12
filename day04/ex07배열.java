package day04;

public class ex07배열 {

	public static void main(String[] args) {
		int[] arr = {15,14,13,48,46,35,47,25};
		int max=arr[0];
		
		for(int i= 0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.print("가장 큰 값은 ");
		System.out.println(max+"입니다.");
		
		
		int min=arr[0];
		
		for(int i= 0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.print("가장 작은 값은 ");
		System.out.println(min+"입니다.");
	}

}
