package day03;

public class ex10이중for문 {

	public static void main(String[] args) {
//i 의 값은 0으로 해도 됨 ex) i =0; 행의 초기값
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
