import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		String str = sc.next();
		
		int score = 0;
		int plus = 1;
		
		for (int i = 0; i < str.length(); i++) {
			String ox = String.valueOf(str.charAt(i));
			
			if(ox.equals("o")) {
				score += plus;
				plus++;
			}else {
				plus = 1;
			}
		}
		System.out.println(score);
	}

}
