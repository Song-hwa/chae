package day04;

public class ex07�迭 {

	public static void main(String[] args) {
		int[] arr = {15,14,13,48,46,35,47,25};
		int max=arr[0];
		
		for(int i= 0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.print("���� ū ���� ");
		System.out.println(max+"�Դϴ�.");
		
		
		int min=arr[0];
		
		for(int i= 0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.print("���� ���� ���� ");
		System.out.println(min+"�Դϴ�.");
	}

}
