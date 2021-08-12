package OOP;

public class People {
//t설계도면을 작성하는 공간>>추상화작업
	//1.필드(속성, 데이터)
	//-이름
	String name = "정형";
	//-나이
	int age;
	//-키
	double height;
	///장기
	String[] organs; 
	
	
	
	//2.메소드(기능,로직)
	//1. 밥먹는다
	public void eat() {
	System.out.println("밥을 먹는다");
	}
	//2.잔다
	public void sleep() {
		System.out.println("잠을잔다");
	}
	
	//3.공부한다
	public void study() {
	System.out.println("공부를 한다"); 
		
	}
}
