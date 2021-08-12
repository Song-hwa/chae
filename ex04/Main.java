package ex04;

public class Main {

	public static void main(String[] args) {
		RegularEmployee regular = new RegularEmployee("20081842", "chasonghwa", 4000, 400);

		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "만원");

		TemEmplyee temp = new TemEmplyee("20081842", "chaesonghwa", 3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay() + "만원");

		System.out.println();
		
		PartTimeEmployee partTime = new PartTimeEmployee("20081842","chaesonghwa",10,10);
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay()+"만원");
		
		//하나의 계산기로 여러 직급의 pay 계산!
		PayCalculator cal = new PayCalculator();
		int money = cal.run(partTime);
	
		System.out.println("money:" +money);
		
		
		

	}

}
