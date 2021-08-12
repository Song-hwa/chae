package day03;

public class foreach {

	public static void main(String[] args) {
		//for each문 사용하기
		//for 문과는 다르게 배열을 함께 활용하여 사용할 수 있는 반복문
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i : arr) {
			System.out.print(i+"  ");
		}
		System.out.println();
        for(int i = 0; i<arr.length; i++) {
        	System.out.println(arr[i]+"  ");
        	
        }
	}

}
