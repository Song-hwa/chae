package ex_01;

public class Cat extends Animal

{
//고양이 만의 eat(), move()만들기
	
	@Override
	public void eat() {
	   System.out.println("멸치를 먹는다");
	}
	@Override
		public void move() {
		  System.out.println("장난감을 잡는다");
}
}
