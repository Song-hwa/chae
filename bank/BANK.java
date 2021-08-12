package bank;

public class BANK {
  //1.필드(속성)
	// 1. 필드(속성)
	   private int money; //캡슐화 진행(정보은닉)

	   // 2. 메소드(기능)
	   // 메소드 명 : deposit / 매개변수 : 정수형 1개 / 리턴타입X
	   public void deposit(int money) {
	      this.money += money;
	      //this : 현재 클래스 자체를 지칭하는 키워드
	   }

	   // 메소드 명 : withdraw/ 매개변수 : 정수형 1개 / 리턴타입X
	   public void withdraw(int money) {
	      this.money -= money;
	   }

	   // 메소드명 : showmoney/ 매개변수 : X / 리턴타입 정수형
	   public int showmoney() {

	      return money;
	   }

	
	
	
	
	
	
}
