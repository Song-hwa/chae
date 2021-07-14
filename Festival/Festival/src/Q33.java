
public class Q33 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}
	
	public static int powerN(int base, int n) {
		int result = 1;
		while(n > 0) {
			result *= base;
			n--;
		}
		return result;
	}
	
}
