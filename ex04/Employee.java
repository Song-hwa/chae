package ex04;

public abstract class Employee {
//모든 직급의 클래스로부터 공통되는 필드, 메소드를 지니고 있다
	//protected : 상속을 받거나 같은 패키지 안에 있다면 외부에서도 접근이 가능하다
	protected String empno;
	protected String name;
	protected int pay;
	
	//공통기능중 추상메소드 만들기>abstract
	// 추상 메소드의 특징> 몸체를 가지고 있지 않는다
	//                >추상 메소드는 추상 클래스에 포함되어야 한다
	public abstract int getMoneyPay(); 
		
	//일반적인 메소드도 지닐 수 있다
	public String print() {
		return empno + ":"+name+":"+pay;
	}		
	}
