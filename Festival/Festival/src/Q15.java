
public class Q15 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] arr = score.split(",");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("A")) {
				a++;
			}else if (arr[i].equals("B")) {
				b++;
			}else if (arr[i].equals("C")) {
				c++;
			}else if (arr[i].equals("D")) {
				d++;
			}else if (arr[i].equals("F")) {
				f++;
			}
		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");
	}

}
