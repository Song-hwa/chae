package ex_01;

public class Main {

	public static void main(String[] args) {
		// 다형성: 다양한 형태로 존재하지만 같은 기능을 지니고 있는 것들
		//1.ㅁㅔ소드 오버라이딩
		//2.상속활용(상속+캐스팅+오버라이딩)
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		//a.eat();
		//a.move();
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		c.eat();
		//다운캐스팅: 부모클래스가 자식클래스 타입으로 형변환
// 업캐스팅 (자동형변환):>고양이는동물이다
		
	    a1 = d; //Animal의 클래스 형태로 형변환
	    a2 = c;
	    
	    a1.eat();
	    a2.eat();
	  //다운캐스팅: 부모클래스가 자식클래스 타입으로 형변환
	    //1.강제형변환이 필요하다
	    //2. 반드시 업케스팅으로 생성된 객체에 한해서만 다운캐스팅이 가능하다
	    
	    Dog d2 = (Dog) a1;
	    Cat c2 = (Cat) a2;
	    
	    System.out.println();
	    
	    d2.eat();
	    c2.eat();
	    //업캐스팅이 진행되지 않은 다운캐스팅에서는>컴파일 오류/코드상의 에러x
	//    Animal a = new Animal();
	 //   Cat cat = (Cat) a;
	    //다형성
	    Animal animal = new Dog();
	    animal.eat();
	    animal.move();

	    Animal animal2 = new Cat();
	    animal2.eat();
	    animal2.move();
	}
}
}
}
}

//고양이는 동물이다
		

}
}
