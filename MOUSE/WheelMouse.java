package MOUSE;

public class WheelMouse extends Mouse {
	
	public void leftClick() {
		System.out.println("�� ����Ŭ��");
	}
	public void wheel() {
		System.out.println("�ٻ��");
	}
	@Override
	public void rightClick() {
		
		//super.rightClick();//super - >�θ�Ŭ����
	    System.out.println("�� ����Ŭ��");
	    
	}
}
