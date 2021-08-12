package method;

public class method1_01 {

	public static void main(String[] args) {
		// 오버로ding
		// 하나의 기능으로 여러개의 데이터 처리를 해줄수 있게 도와주는 기능
		
		print(3);
		print("문자3");
        print(1,3);
        
        System.out.println()
	}

	private static void print(int i, int j) {
	   System.out.println("더하기 출력"+(i+j));
		
	}

	private static void print(String string) {
		System.out.println("문자출력"+string);
		
	}
	private static void print(int i) {
		System.out.println("숫자하나출력"+i);
		
}
}
