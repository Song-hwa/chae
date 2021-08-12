package Ex03;

//추상 클래스 만들기
//abstract
//1. 추상클래스는 하나 이상의 추상 메소드를 포함하고 있어야 한다.
public abstract class Car {
 
 //운전을 할 수 있는 기능 -> 추상메소드 변경
 //추상 메소드는 구체적인 내용을 가질 수 업다. -> 몸체를 가질 수 없다.
 public abstract void runner();
 
 int tire=4;
 String color;
 
 //타이어 갯수 확인 메소드
 public int getTire() {
    return tire;
 }
 
}