package MOUSE;

public class WheelMouse extends Mouse {
	
	public void leftClick() {
		System.out.println("좌 더블클릭");
	}
	public void wheel() {
		System.out.println("휠사용");
	}
	@Override
	public void rightClick() {
		
		//super.rightClick();//super - >부모클래스
	    System.out.println("우 더블클릭");
	    
	}
}
