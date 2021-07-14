
public class Q12 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("결과 확인 : " + isDivide(num1, num2));
	}
	
	
	public static boolean isDivide(int num1, int num2) {
		if(num1%num2==0) {
			return true;
		}else {
			return false;
		}
	}
}
