
public class Q06 {

	public static void main(String[] args) {
		int cnt = 1;
		int result = 0;
		
		for (int i = 77; i >= 1; i--) {
			result += i*cnt;
			cnt++;
		}
		System.out.println(result);
	}

}
