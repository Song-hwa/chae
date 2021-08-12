package MOUSE;

public class mousemain {

	public static void main(String[] args) {
		// Mouse 클래스 불러오기!> 객체생성
		//mouse(기본 마우스 )클래스 불러오기!> 객체 생성
		// 상속의 특징!
		//1. 다중상속이 불가능
		//2. 상속의 횟수에는 제한이 없다
		//3. 모든 클래스는 object 클래스를 상속 받는다
		//4. 
		
		Mouse m = new Mouse();
		m.leftClick(); //"좌 클릭
		m.rightClick();
		m.drag();

		System.out.println();
		
		
		//WheelMouse 객체생성!
		WheelMouse wm = new WheelMouse();
		wm.leftClick();//"좌 더블클릭
		wm.rightClick();
		wm.drag();
		wm.wheel();
		
		
		//SMARTMOUSE 객체
		smartmouse sm = new smartmouse();
		sm.leftClick();
		sm.rightClick();
		sm.drag();
		sm.smartClick();

		Object ob = new Object();
}
}
