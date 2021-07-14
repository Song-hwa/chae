
public class Q34 {

	public static void main(String[] args) {
		String str = "01001101";

		char[] arr = str.toCharArray();
		int a = 1;
		int result = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == '1') {
				result += a;
			}
			a *= 2;
		}
		System.out.println(str + "(2)" + " = " + result + "(10)");
	}

}
