package ex_01;

public class Main {

	public static void main(String[] args) {
		// ������: �پ��� ���·� ���������� ���� ����� ���ϰ� �ִ� �͵�
		//1.���ļҵ� �������̵�
		//2.���Ȱ��(���+ĳ����+�������̵�)
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		//a.eat();
		//a.move();
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		c.eat();
		//�ٿ�ĳ����: �θ�Ŭ������ �ڽ�Ŭ���� Ÿ������ ����ȯ
// ��ĳ���� (�ڵ�����ȯ):>����̴µ����̴�
		
	    a1 = d; //Animal�� Ŭ���� ���·� ����ȯ
	    a2 = c;
	    
	    a1.eat();
	    a2.eat();
	  //�ٿ�ĳ����: �θ�Ŭ������ �ڽ�Ŭ���� Ÿ������ ����ȯ
	    //1.��������ȯ�� �ʿ��ϴ�
	    //2. �ݵ�� ���ɽ������� ������ ��ü�� ���ؼ��� �ٿ�ĳ������ �����ϴ�
	    
	    Dog d2 = (Dog) a1;
	    Cat c2 = (Cat) a2;
	    
	    System.out.println();
	    
	    d2.eat();
	    c2.eat();
	    //��ĳ������ ������� ���� �ٿ�ĳ���ÿ�����>������ ����/�ڵ���� ����x
	//    Animal a = new Animal();
	 //   Cat cat = (Cat) a;
	    //������
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

//����̴� �����̴�
		

}
}
