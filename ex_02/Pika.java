package ex_02;

public class Pika extends Doll {
//피카추 인형만 있는 인형 클래스
	//public void pika() {
	//	System.out.println("피카추인형");
	//}
//}
//Doll 클래스로부터 물려받는 매소드 활용하여
	//피카추인형만들기
	@Override
	public void doll() {
		System.out.println("피카추인형");	
	}
}