package MOUSE;

public class mousemain {

	public static void main(String[] args) {
		// Mouse Ŭ���� �ҷ�����!> ��ü����
		//mouse(�⺻ ���콺 )Ŭ���� �ҷ�����!> ��ü ����
		// ����� Ư¡!
		//1. ���߻���� �Ұ���
		//2. ����� Ƚ������ ������ ����
		//3. ��� Ŭ������ object Ŭ������ ��� �޴´�
		//4. 
		
		Mouse m = new Mouse();
		m.leftClick(); //"�� Ŭ��
		m.rightClick();
		m.drag();

		System.out.println();
		
		
		//WheelMouse ��ü����!
		WheelMouse wm = new WheelMouse();
		wm.leftClick();//"�� ����Ŭ��
		wm.rightClick();
		wm.drag();
		wm.wheel();
		
		
		//SMARTMOUSE ��ü
		smartmouse sm = new smartmouse();
		sm.leftClick();
		sm.rightClick();
		sm.drag();
		sm.smartClick();

		Object ob = new Object();
}
}
