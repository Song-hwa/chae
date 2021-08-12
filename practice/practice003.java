package practice;

public class practice003 {

	public static void main(String[] args) {
		
		int result = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				result+=-i;
				System.out.print(-i+" ");
			}else {
				result+=i;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("°á°ú : "+result);
	}

}
