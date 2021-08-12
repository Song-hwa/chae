package ex04;

public class RegularEmployee extends Employee {
	
  //   private String empno; // 사번
	// private String name; // 이름
   //  private int pay; // 연봉
	   private int bonus; // 보너스

	   public RegularEmployee(String empno, String name, int pay, int bonus){
	      this.empno = empno;
	      this.name = name;
	      this.pay = pay;
	      this.bonus = bonus;
	   }// 생성자

	   public int getMoneyPay() {
	      return (pay + bonus) / 12;
	   }// 월급

	   public String print() {
	      return empno + " : " + name + " : " + pay;
	   }// 사원 정보
	   
}