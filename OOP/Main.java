package OOP;

public class Main {

	public static void main(String[] args) {
		//객/체를 생성하는 공간
		//설계도기반으로 객체를 메모리에 할당하는 공간>클래스의 인스턴스화
		People hyung = new People();
	    // new>>레퍼런스변수(참조형변수)를 생성할때 쓰는 키워드
		
		
		System.out.println(hyung);
		System.out.println(hyung.age);
		System.out.println(hyung.name);
		
		hyung.name="정형";
		hyung.age = 20;
		hyung.height=185.9;
		hyung.organs = new String[3];
		hyung.organs[0]="심장";
		hyung.organs[1]="간";
		hyung.organs[2]="폐";
							
		
		System.out.println(hyung.name);
		System.out.println(hyung.height);
		System.out.println(hyung.organs[1]);
		System.out.println(hyung.age);
		
		hyung.eat();
		hyung.sleep();
		
		

		
		
		

	}

}
