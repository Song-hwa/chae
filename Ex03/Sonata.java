package Ex03;

public class Sonata extends Car {

	//일반 클래스에서 부모클래스를 물려받으면
	//부모의 기능을 사용하거나 사용하지 않거나 결정을 할 수 있다
	//물려받는 추상메소드에 대하여
	//구체적인 기능을 구현해줘야한다
	
	//일반 클래스에서 부모클래스를 물려받으면
	//부모의 기능을 사용하거나 말거나 결정을 할수 있다
	//물려받는 추상메소드에 대하여
	//구체적인 기능을 구현해줘야한다
	public void runner() {
		System.out.println("빠른 속도!아하하하하");
	}
	//sonata만이 갖는 기능
	public void wet() {
		System.out.println("도로가 젖어있습니다, 시스템을 최적화하겠습니다");
	}
}
