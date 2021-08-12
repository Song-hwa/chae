package MOUSE;

public class Mouse {

	// Mouse 클래스 >부모 클래스/기능을 물려줄수 있는 클래스
	// 내용이 바뀌면 물려받고 있는 자식 클래스의 내용도 자동으로 바뀐다
	
	
	//마우스의 기능 설계
	//1. 좌 클릭하기 메소드
	public void leftClick() {
		System.out.println("좌 클릭!!");
		
	}
	//메소드 오버라이딩(재정의)
	//메소드 오버로딩(중복정의)
	public String leftClick(String str) {
		return "";
	}
	
	
	//2. 우 클릭 하기 메소드>rightClick()
	public void rightClick() {
		System.out.println("우 클릭!!");
		
	}
	//3. 드래그 하기 메소드>drag()
	//물려주고 싶은 기능이 아닐때> private
	public void drag() {
		System.out.println("드래그 하기~");
	
	
	//휠 사용하기
	}
	public void getDrag{
		drag()
		
		//private으로 지정된 메소드의 연산처리 값을 
		//return 값으로 반환해준다
	}
}
