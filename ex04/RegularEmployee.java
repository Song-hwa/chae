package ex04;

public class RegularEmployee extends Employee {
	
  //   private String empno; // ���
	// private String name; // �̸�
   //  private int pay; // ����
	   private int bonus; // ���ʽ�

	   public RegularEmployee(String empno, String name, int pay, int bonus){
	      this.empno = empno;
	      this.name = name;
	      this.pay = pay;
	      this.bonus = bonus;
	   }// ������

	   public int getMoneyPay() {
	      return (pay + bonus) / 12;
	   }// ����

	   public String print() {
	      return empno + " : " + name + " : " + pay;
	   }// ��� ����
	   
}