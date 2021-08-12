package practice3;

public class Qus2 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("A")) {
				++A;
			}else if (arr[i].equals("B")) {
				++B;
			}else if (arr[i].equals("C")) {
				++C;
			}else if (arr[i].equals("D")) {
				++D;
			}else if (arr[i].equals("F")) {
				++F;
			}
		}
		System.out.println("A : " + A + "명");
		System.out.println("B : " + B + "명");
		System.out.println("C : " + C + "명");
		System.out.println("D : " + D + "명");
		System.out.println("F : " + F + "명");
	}

}
