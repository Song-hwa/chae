package Ex03;

public class Main {

	public static void main(String[] args) {
		// 추상화?
		//여러 객체에서 공통적으로 사용되는 기능들을
		//뽑아내는 것을 추상화
		
		Sonata so = new Sonata();
		so.color = "silver";
		System.out.println(so.getTire());
		so.runner();
		so.wet();
		
		Volvo vol = new Volvo();
		vol.runner();
		vol.pilot();
		
		// 추상 클래스는 객체화 할 수 없다
		//상속을 통하여 무언가 기능을 꼭 구체화 하여 정희해야할때
		//추상화를 사용한다
		
		//Car c = new Car();
		
		
	}

}
