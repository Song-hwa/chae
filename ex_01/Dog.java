package ex_01;

public class Dog extends Animal {
//Animal 클래스를 물려받는 dog클래스 생성
	//부모의 기능을 물려받아 나만의 기능 생성
	//메소드 오버라이딩> 재정의
	//오버라이딩의 성립조건
	
	//1.메소드의 반환타입, 이름, 매개변수 동일
	
	//2. 중괄호 안의 내용만 변경
	
	@Override
	public void eat() {
	   System.out.println("육포를 먹는다");
	}
	@Override
		public void move() {
		  System.out.println("꼬리를 흔들면서 움직인다");
		 
		}
	
}
