package day04;

public class ex06배열 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int cnt = 0;
		
		System.out.print("arr에 들어있는 홀수는");
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				cnt++;
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("이며, ");
		System.out.println("총 "+cnt+"개 입니다.");
		
	}

}
