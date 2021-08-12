package day04;

public class ex01이중for문 {

	public static void main(String[] args) {
//감소하는 별찍기
		//i는 행, j는 열, j가 i보다 크면 j의 별은 5개에서 하나 씩 감소한다.
		for (int i = 0; i < 5; i++) {
			for (int j = 5; i < j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
