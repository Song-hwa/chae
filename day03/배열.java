package day03;

public class 배열 {

	public static void main(String[] args) {
		
		
		
		// 1.배열생성
		int[] arr = new int [10];
		int[] arr2 = {1,2,3,4,5,6};

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;	
	 
		for(int i =0; i<4; i++) {
			arr[i] =1;
		}
		for(int i=0; i<arr.length; i++) {
			arr[0] = 1;
		}
       
	}

}
