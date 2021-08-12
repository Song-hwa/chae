package day4;

public class method06 {

	public static void main(String[] args) {
		// 함수의 입력되는 값의 약수를 구해주는 매소드
//getDivisor(10)
		//10의 약수 :1 2 5 10
		
		getDivisor(10);
	}
private static void getDivisor(int num1) {
	System.out.print(num1+"의 약수:");
	
	for (int i = 1; i<= num1; i++) {
		if(num1 %i ==0) {
			System.out.print(i+" ");
		}
	}
}
}
