package bank;

public class MAIN01 {

	public static void main(String[] args) {
		//객체를 생성하는 공간
	
		BANK bank1 = new BANK();
	
		
		//1. money에 50000원 넣기

		bank1.deposit(50000);
		//.2money에서 30000원빼기
		bank1.withdraw(30000);
		//3. 내 잔액을 보여주기
		System.out.println(bank1.showmoney());
		
	}

}
