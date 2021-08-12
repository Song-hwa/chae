package day04;

public class ex14for_each문_실습 {

	public static void main(String[] args) {
		
		int[] arr= {3,4,9,21,71,100};
		
		//for each를 이용하여 홀수만 출력하기
		
		for(int i : arr) {
			if (i%2==1) {
				System.out.print(i+ " ");
			}
		}
	}

}
