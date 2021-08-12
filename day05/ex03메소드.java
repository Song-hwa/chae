package day05;

public class ex03메소드 {

	public static void main(String[] args) {
		//메소드를 호출할 때는 사전에 정의가 되어 있어야 한다!
		System.out.println(today());
		
	}
	// 매개변수X, 반환값O 메소드
	// private : 클래스 외부에서느 접근이 불가능하지만 내부에서는 접근이 가능한 지정자
	public static String today() {
		String day = "4월 16일";
		return day;
	}
	
	
}
